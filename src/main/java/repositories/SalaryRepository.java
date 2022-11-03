package repositories;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dto.EmpLoanSummaryListDto;
import entities.MonthEndAllowance;
import entities.MonthEndDeduction;
import entities.MonthEndTransaction;
import entities.PayrollSummaryView;

@Stateless
public class SalaryRepository implements Serializable {

	private static final long serialVersionUID = -6224428128162111170L;
	@PersistenceContext(unitName = "payrollPU")
	private EntityManager em;

	public List<MonthEndTransaction> getAllEmployeeSalaryList(Class<MonthEndTransaction> class1) {
		return this.em.createQuery("Select a.* from MonthEndTransaction a", MonthEndTransaction.class).getResultList();

	}

	public MonthEndTransaction getEmployeeSalary(Integer id) {
		try {
			return this.em.createQuery("Select a from MonthEndTransaction a where a.id = :id",
					MonthEndTransaction.class).setParameter("id", id).getSingleResult();
			
		} catch (Exception e) {
			System.out.println("No current record: " + e.getMessage());
			return new MonthEndTransaction();
		}
		
	}
	
	public List<MonthEndAllowance> getMEA(int id) {
		List<MonthEndAllowance> l = null;
		try {
			System.out.println("get MEA in salary repository");
			l = this.em.createQuery("Select a from MonthEndAllowance a where a.id = :id",
					MonthEndAllowance.class).setParameter("id", id).getResultList();
			return l;
		} catch (Exception e) {
			System.out.println("MonthEndAllowance query error for : " + id +"-" + e.getMessage());
			throw e;
		}
		
	}
	
	public List<MonthEndDeduction> getMED(int id) {
//		return this.em.createQuery("Select a from MonthEndDeduction a where a.id = :id",
//				MonthEndDeduction.class).setParameter("id", id).getResultList();
		List<MonthEndDeduction> l = null;
		try {
			l = this.em.createQuery("Select a from MonthEndDeduction a where a.id = :id",
					MonthEndDeduction.class).setParameter("id", id).getResultList();
			return l;
		} catch (Exception e) {
			System.out.println("MonthEndDeduction query error for : " + id +"-" + e.getMessage());
			throw e;
		}
	}

	public void save(MonthEndTransaction met, List<MonthEndAllowance> mea, List<MonthEndDeduction> med) {
		System.out.println("MEA:" + mea);
		
		try {

			if (met.getId() == 0) {
				System.out.println("new transaction");
				System.out.println("Month End Trn:" + met);
				em.persist(met);
				em.flush();

			} else {
				System.out.println("update transaction");
				em.merge(met);
				em.flush();
			}
			deleteMEA(met.getId());
			for (MonthEndAllowance a : mea) {
				this.em.persist(a);
			}
			deleteMED(met.getId());
			for (MonthEndDeduction d : med) {
				this.em.persist(d);
			}
			em.flush();

		} catch (Exception e) {
			System.out.println("Month End Transaction Error on save:" + e.getMessage());
			throw e;
		}
		
	}
	
	public void deleteMEA(int id) {
		this.em.createQuery("DELETE FROM MonthEndAllowance a WHERE a.id = :id")
		.setParameter("id", id)
		.executeUpdate();
	}
	
	public void deleteMED(int id) {
		this.em.createQuery("DELETE FROM MonthEndDeduction a WHERE a.id = :id")
		.setParameter("id", id)
		.executeUpdate();
	}
	
	public List<PayrollSummaryView> getSalaryList(String divCode, String deptCode) {
		switch (divCode) {
		case "0":
		if( deptCode.equals("0")) {
			
			try {
				List<PayrollSummaryView> l = this.em.createQuery("Select a from PayrollSummaryView a", PayrollSummaryView.class).getResultList();
				System.out.println("result: " + l);
				return l;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
//			 return this.em.createQuery("Select a from PayrollSummaryView a", PayrollSummaryView.class).getResultList();
		} else {
			 return this.em.createQuery("Select a from PayrollSummaryView a where a.divCode = :divCode ", PayrollSummaryView.class)
						.setParameter("divCode", divCode)
						.getResultList();
//			System.out.println("new query:");
//			String q = "a.emp_code,";
//					q = q + "a.emp_name,"; 
//					q = q  + "a.dept_code,";
//					q = q  + "b.dept_name,";
//					q = q  + "b.division_code,"; 
//					q = q  + "c.division_name,"; 
//					q = q  + "a.basic_salary,"; 
//					q = q  + "d.attendance,"; 
//					q = q  + "d.loan_deduction,"; 
//					q = q  + "d.rent_allowance," ;
//					q = q  + "d.travel_allowance,"; 
//					q = q  + "d.spage_allowance,";
//					q = q  + "d.gosi_amt,"; 
//					q = q  + "d.hbank_loan,";
//					q = q  + "d.nShift_allowance,"; 
//					q = q  + "d.other_allowance_total,"; 
//					q = q  + "d.other_deduction_total,"; 
//					q = q  + "d.late_hrs,"; 
//					q = q  + "(d.OT_1 * g.OT_RATE1) + (d.OT_2*g.OT_RATE2) as ot_total,"; 
//					q = q  + "(((a.BASIC_SALARY/30) * d.ATTENDANCE ) + d.RENT_ALLOWANCE +d.TRAVEL_ALLOWANCE +d.SPAGE_ALLOWANCE + (d.NSHIFT_ALLOWANCE*g.NS_AMT)+"; 
//					q = q  + "(d.OT_1 * g.OT_RATE1) + (d.OT_2*g.OT_RATE2)+ d.other_allowance_total) as sub_total,"; 
//					q = q  + "(((a.BASIC_SALARY/30) * d.ATTENDANCE ) + d.RENT_ALLOWANCE +d.TRAVEL_ALLOWANCE +d.SPAGE_ALLOWANCE + (d.NSHIFT_ALLOWANCE*g.NS_AMT)+"; 
//					q = q  + "(d.OT_1 * g.OT_RATE1) + (d.OT_2*g.OT_RATE2)+ d.other_allowance_total-d.loan_deduction-d.other_deduction_total-d.gosi_amt-((a.BASIC_SALARY/30)* d.late_hrs)";    
//					q = q  + ") as net_salary"; 
//					q = q  + "from emp_mast a, dept b, division c, met_main d, ot_table g"; 
//					q = q  + "where a.dept_code = b.dept_code and"; 
//					q = q  + "b.division_code = c.division_code and";
//					q = q  + "a.emp_code = d.emp_code" ;
//			
//			  Query query = em.createNativeQuery(q);
//			   
//			   List<Object[]> ls =  query.getResultList();
////			   List<EmpLoanSummaryListDto> dtoList =  new ArrayList<EmpLoanSummaryListDto>();
//			   
//			   for (Object[] a : ls) {
////				   EmpLoanSummaryListDto els = new EmpLoanSummaryListDto();
//				   System.out.println("Other Allowance total:" + a[15]);
////				   els.setId((int) a[0]);
////				   els.setEmpName((String) a[1]);
////				   els.setLastTransactionDate((Date) a[2]);
////				   els.setTotalLoans((BigDecimal) a[3]);
////				   els.setTotalPayment((BigDecimal) a[4]);
////				   
////				   dtoList.add(els);
//				}
//			   return null;
			
		}
			
		default:
			if( deptCode.equals("0")) {
				 return this.em.createQuery("Select a from PayrollSummaryView a where a.divCode = :divCode ", PayrollSummaryView.class)
							.setParameter("divCode", divCode)
							.getResultList();
			} else {
				return this.em.createQuery("Select a from PayrollSummaryView a where a.divCode = :divCode and a.deptCode = :deptCode", PayrollSummaryView.class)
						.setParameter("divCode", divCode)
						.setParameter("deptCode", deptCode)
						.getResultList();
			}

		}
//		
	}

}
