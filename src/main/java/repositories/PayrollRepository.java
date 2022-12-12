package repositories;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import dto.EmpLoanSummaryDto;
import dto.EmpLoanSummaryListDto;
import dto.PayrollSummaryDto;
import entities.Department;
import entities.LeaveTransaction;
import entities.LoanMaster;
import entities.LoanTransaction;
import entities.Month;
import entities.SalaryIncrement;
import exception.DataNotFoundException;
import exception.NoResultException;
import exception.SQLServerException;

@Stateless
public class PayrollRepository implements Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "payrollPU")
	private EntityManager em;

	private EntityManager getEntityManager(Class<?> clazz) {
		return em;
	}

	public <T> List<T> getAll(Class<T> type) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> q = cb.createQuery(type);
		Root<T> r = q.from(type);
		return em.createQuery(q.select(r)).getResultList();
	}

	public List<EmpLoanSummaryListDto> getAllLoanSummary() {
//		return this.em.createQuery("Select a FROM LoanSummaryView a", LoanSummaryView.class).getResultList();
		System.out.println("getAllLoanSummary:**********");
		try {
			String q = "select 	lt.emp_code as id, em.emp_name as empName, max(lt.trn_date) as lastTransactionDate, sum(lt.dr_amt) as totalPayment, sum(lt.cr_amt) as totalLoans";
			q = q + " from emp_loan_trns  lt inner join EMP_MAST  em on lt.emp_code = em.emp_code ";
			q = q + " group by lt.emp_code,em.emp_name ";
			Query query = em.createNativeQuery(q);

//			   List<EmpLoanSummaryListDto> l = query.getResultList();
			List<Object[]> ls = query.getResultList();
			List<EmpLoanSummaryListDto> dtoList = new ArrayList<>();

			for (Object[] a : ls) {
				EmpLoanSummaryListDto els = new EmpLoanSummaryListDto();
				els.setId((int) a[0]);
				els.setEmpName((String) a[1]);
				els.setLastTransactionDate((Date) a[2]);
				els.setTotalLoans((BigDecimal) a[3]);
				els.setTotalPayment((BigDecimal) a[4]);

				dtoList.add(els);
			}
			return dtoList;
//			   System.out.println("list: " + l);
//			   return l;
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("error-----");
			System.out.println(ex.getMessage());
			ex.printStackTrace();

		}
		return null;

	}

//	public List<LoanTransaction> getAllLoanSummary1() {
//		return this.em.createQuery("SELECT a FROM  LoanTransaction a  where a.empCode = 212", LoanTransaction.class).getResultList();
//
//	}

	public <T> List<T> getAllByCriteria(Class<T> entity, Map<String, String> parameters) {
		final StringBuilder parameter = new StringBuilder("");
		parameters.forEach((key, value) -> {
			parameter.append(" AND UPPER(a." + key + ") LIKE UPPER('%" + value.toString() + "%')");
		});
		if (parameter.length() > 0) {
			parameter.delete(0, 4);
			parameter.insert(0, " WHERE ");
		}
		List<T> returnList = null;
		try {
			returnList = this.em
					.createQuery("SELECT a FROM " + entity.getSimpleName() + " a " + parameter.toString(), entity)
					.getResultList();
			return returnList;
		} catch (Exception e) {
			throw new SQLServerException("Get All by Criteria");
		}

	}

	public <T> T getById(Class<T> type, Object id) {
		T t = em.find(type, id);
		if (t == null) {
			throw new DataNotFoundException("Data not found for id: " + id);
		}
		return t;
	}

	public <T> T getByKey(Class<T> entity, String searchKey, String searchValue) {
		try {
			T t = em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getSingleResult();
			return t;
		} catch (javax.persistence.NoResultException e) {
			throw new NoResultException("Data not found for searchValue: " + searchValue);
		}
	}

	public <T> T getByKey(Class<T> entity, String searchKey, int searchValue) {
		System.out.println("search key:" + searchKey);
		System.out.println("search value:" + searchValue);
		System.out.println("entity:" + entity);
		try {
			T t = em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getSingleResult();
			return t;

//		}	catch (NoResultException nre) {
//		        return null;
		} catch (Exception e) {
			throw new NoResultException("Data not found for searchValue: " + e + searchValue);
		}

	}

	public <T> List<T> getListByKey(Class<T> entity, String searchKey, int searchValue) {
		System.out.println("getListByKey.....");
		try {
			List<T> t = em.createQuery(
					"Select a from " + entity.getSimpleName() + " a " + "where a." + searchKey + "= :searchValue",
					entity).setParameter("searchValue", searchValue).getResultList();
			System.out.println("t:" + t);
			return t;

//		}	catch (NoResultException nre) {
//		        return null;
		} catch (Exception e) {
			throw new NoResultException("Data not found for searchValue: " + e + searchValue);
		}
	}

	@Transactional
	public <T> T save(T t) {
		try {
			em.persist(t);
			em.flush();
//			em.refresh(t);
//			em.close();
			System.out.println(t);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
//			throw new SQLServerException("On Saving");
			throw e;
		}

	}

	public <T> T update(T t) {
		try {
			em.merge(t);
			System.out.println("update completed!");
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SQLServerException("On Updating");
		}
	}

	public <T> void delete(T t) {
		try {
			em.remove(em.merge(t));
		} catch (Exception e) {
			throw new SQLServerException("On deleting");
		}

	}

	public <T> List<T> getAllRecords(Class<T> tClass, Map<String, Object> filters, int start, int maxR,
			String sortFieldName, boolean isAsc) {

		final StringBuilder filter = new StringBuilder("");
		filters.forEach((key, value) -> {
			System.out.println("key:" + key + ", value:" + value);
			if (value != null && value.getClass().isArray()) {
				filter.append(" AND CONCAT('', UPPER(coalesce(t." + key + ", ''))) IN ( "
						+ String.join(",", ((String[]) value)) + ")");
			} else {
				filter.append(" AND  ")
						.append(!value.toString().trim().isEmpty()
								? "( t." + key + " IS NOT NULL AND UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%"
										+ value.toString() + "%'))"
								: "( t." + key + " IS NULL OR UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%"
										+ value.toString() + "%'))");
			}
		});
		System.out.println("Filter:" + filter);
		if (filter.length() > 0) {
			filter.delete(0, 4);
			filter.insert(0, " WHERE ");
		}
		String sorting = sortFieldName == "" ? "" : " ORDER BY t." + sortFieldName + (isAsc ? " ASC" : " DESC");
		System.out.println("sort field + asc: " + sortFieldName + isAsc);
		List<T> s = null;
		try {
			s = getEntityManager(tClass)
					.createQuery("SELECT t FROM " + tClass.getSimpleName() + " t " + filter.toString() + sorting,
							tClass)
					.setFirstResult(start).setMaxResults(maxR).getResultList();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		System.out.println("Query : " + tClass.getSimpleName() + "SELECT t FROM " + tClass.getSimpleName() + " t "
				+ filter.toString() + sorting);
		return s;
	}

	public <T> long getSize(Class<T> tClass, Map<String, Object> filters) {
		final StringBuilder filter = new StringBuilder("");
		filters.forEach((key, value) -> {
			if (value != null && value.getClass().isArray()) {
				filter.append(
						" AND UPPER(coalesce(t." + key + ", '')) IN ( " + String.join(",", ((String[]) value)) + ")");
			} else {
				filter.append(" AND  ")
						.append(!value.toString().trim().isEmpty()
								? "( t." + key + " IS NOT NULL AND UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%"
										+ value.toString() + "%'))"
								: "( t." + key + " IS NULL OR UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%"
										+ value.toString() + "%'))");
			}
			/*
			 * System.out.println("key:" + key + ", value:" + value);
			 * filter.append(" AND UPPER(a." + key + ") LIKE UPPER('%" + value.toString() +
			 * "%')");
			 */
		});
		System.out.println("Filter:" + filter);
		if (filter.length() > 0) {
			filter.delete(0, 4);
			filter.insert(0, " WHERE ");
		}
		return getEntityManager(tClass)
				.createQuery("SELECT count(t) FROM " + tClass.getSimpleName() + " t " + filter.toString(), long.class)
				.getSingleResult();
	}
//	public <T> List<T> getAllRecords(Class<T> tClass, Map<String, String> filters, int start, int maxR,
//			String sortFieldName, boolean isAsc) {
//
//		final StringBuilder filter = new StringBuilder("");
//		filters.forEach((key, value) -> {
//			System.out.println("key:" + key + ", value:" + value);
//			filter.append(" AND UPPER(coalesce(t." + key + ", '')) LIKE UPPER('%" + value.toString() + "%')");
//		});
//		System.out.println("Filter:" + filter);
//		if (filter.length() > 0) {
//			filter.delete(0, 4);
//			filter.insert(0, " WHERE ");
//		}
//		String sorting = sortFieldName == "" ? "" : " ORDER BY t." + sortFieldName + (isAsc ? " ASC" : " DESC");
//		System.out.println("sort field + asc: " + sortFieldName + isAsc);
//		List<T> s = null;
//		try {
//			s = this.em.createQuery("SELECT t FROM " + tClass.getSimpleName() + " t " + filter.toString() + sorting,
//					tClass).setFirstResult(start).setMaxResults(maxR).getResultList();
//		} catch (Exception e) {
//			System.out.println("Error : " + e.getMessage());
//		}
//		System.out.println("Query : " + tClass.getSimpleName() + "SELECT t FROM " + tClass.getSimpleName() + " t "
//				+ filter.toString() + sorting);
//		return s;
//	}
//
//	public <T> long getSize(Class<T> tClass, Map<String, String> filters) {
//		final StringBuilder filter = new StringBuilder("");
//		filters.forEach((key, value) -> {
//			System.out.println("key:" + key + ", value:" + value);
//			filter.append(" AND UPPER(a." + key + ") LIKE UPPER('%" + value.toString() + "%')");
//		});
//		System.out.println("Filter:" + filter);
//		if (filter.length() > 0) {
//			filter.delete(0, 4);
//			filter.insert(0, " WHERE ");
//		}
//		return this.em
//				.createQuery("SELECT count(a) FROM " + tClass.getSimpleName() + " a " + filter.toString(), long.class)
//				.getSingleResult();
//	}

	public <T> long getSize(Class<T> tClass) {
		return this.em.createQuery("SELECT count(a) FROM " + tClass.getSimpleName() + " a ", long.class)
				.getSingleResult();
	}

	public List<LeaveTransaction> getEmployeeLeaveAllRecords(Integer empCode) {
		List<LeaveTransaction> l = null;
		try {
			l = this.em
					.createQuery("Select a from LeaveTransaction a where a.empCode = :empCode", LeaveTransaction.class)
					.setParameter("empCode", empCode).getResultList();
			return l;
		} catch (Exception e) {
			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

	}

	public LeaveTransaction getEmployeeLeaveRecord(int empCode, int id) {

		LeaveTransaction lt = this.em
				.createQuery("Select a from LeaveTransaction a where a.empCode = :empCode and a.id = :id",
						LeaveTransaction.class)
				.setParameter("empCode", empCode).setParameter("id", id).getSingleResult();
		return (lt == null ? new LeaveTransaction() : lt);

	}

	public List<LoanTransaction> getEmployeeLoanAllRecords(int empCode) {
		List<LoanTransaction> l = null;
		try {
			l = this.em.createQuery("Select a from LoanTransaction a where a.empCode = :empCode", LoanTransaction.class)
					.setParameter("empCode", empCode).getResultList();
		} catch (Exception e) {

			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

		return l;
	}

	public LoanTransaction getEmployeeLoanRecord(int empCode, int id) {
		LoanTransaction lt = this.em
				.createQuery("Select a from LoanTransaction a where a.empCode = :empCode and a.id = :id",
						LoanTransaction.class)
				.setParameter("empCode", empCode).setParameter("id", id).getSingleResult();
		return (lt == null ? new LoanTransaction() : lt);
	}

	public EmpLoanSummaryDto getEmpLoanSummary(int empCode) {
		try {
//			return this.em.createQuery("Select a from EmployeeLoanSummaryView a where a.empCode = :empCode",
//					EmployeeLoanSummaryView.class).setParameter("empCode", empCode).getSingleResult();
			String q = "select emp_code,max(trn_date) as last_trn_date,sum(dr_amt) as total_dr,sum(cr_amt) as total_cr from emp_loan_trns";
			q = q + " group by emp_code having EMP_CODE = " + empCode;
			Query query = em.createNativeQuery(q);
			Object[] o = (Object[]) query.getSingleResult();

			EmpLoanSummaryDto eDto = new EmpLoanSummaryDto();
			if (o != null) {
				System.out.println("employee loan summary:" + o);
				eDto.setEmpcode(empCode);
				eDto.setDrAmountTotal((BigDecimal) o[2]);
				eDto.setCrAmountTotal((BigDecimal) o[3]);
				eDto.setLastTrnDate((Date) o[1]);

			} else {
				System.out.println("e is null");
			}

			System.out.println("Object:" + o);
//			   LoanTransaction elv = this.em
//					.createQuery(q,LoanTransaction.class).getSingleResult();
////					.setParameter("empCode", empCode).getSingleResult();
//			System.out.println("Employee loan summary view:" + elv);
			return eDto;
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2.getLocalizedMessage());
			e2.printStackTrace();
			return new EmpLoanSummaryDto();
		}

	}

	public void updateLoanMaster(int empCode, LoanTransaction ln) {
		double amount = ln.getCrAmount() - ln.getDrAmount();
		double additionalInstallment = ln.getAdditionalInstallment();
		System.out.println("Additional Installment =" + additionalInstallment);
		LoanMaster lm = new LoanMaster();
		// To do
		// check oracle code to verify how the data is maintained in the loan master
		try {
			lm = this.em.createQuery("Select a from LoanMaster a where a.empCode = :empCode ", LoanMaster.class)
					.setParameter("empCode", empCode).setParameter("empCode", empCode).getSingleResult();

			if (lm != null) {
				System.out.println("lm is not null");
				Query query = this.em.createQuery(
						"Update LoanMaster a set a.loanAmount = a.loanAmount + :amount, a.loanInstallment = a.loanInstallment + :additionalInstallment where a.empCode = :empCode")
						.setParameter("empCode", empCode).setParameter("amount", amount)
						.setParameter("additionalInstallment", additionalInstallment);
				query.executeUpdate();
				System.out.println("Query updated");

			} else {
				System.out.println("lm is null");
				Query query = this.em.createQuery(
						"INSERT INTO LoanMaster (empCode, loanAmount, loanDate,loanInstallment, loanType) VALUES (?,?,?,?,?)")
						.setParameter("empCode", empCode).setParameter("loanAmount", ln.getCrAmount())
						.setParameter("loanDate", ln.getTrnDate())
						.setParameter("loanInstallment", ln.getAdditionalInstallment()).setParameter("loanType", "1");
				query.executeUpdate();
				System.out.println("Query insert");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LoanMaster resultset = " + lm == null);
			System.out.println("error updating loan info:" + e.getMessage());
		}

	}

	public void updateEmpMasterLoanInstallment(int id, double additionalInstallment) {
		Query query = this.em.createQuery(
				"Update Employee a set a.loanInstallment = a.loanInstallment + :additionalInstallment where a.id = :id")
				.setParameter("id", id).setParameter("additionalInstallment", additionalInstallment);
		query.executeUpdate();

	}

	public void salaryIncrement(SalaryIncrement inc) {
//		Employee emp = this.getById(Employee.class, inc.getEmpCode());
		Query query = this.em
				.createQuery("Update Employee a set a.basicSalary = a.basicSalary + :salaryIncrement where a.id = :id")
				.setParameter("id", inc.getEmpCode()).setParameter("salaryIncrement", inc.getSalIncrement());
		query.executeUpdate();
	}

	public void MonthEndClose() {
		try {
			Month m = this.getByKey(Month.class, "status", "current");
			String d1 = m.getYear() + "-" + m.getMonth() + "-" + "01";
			String d2 = m.getYear() + "-" + m.getMonth() + "-" + m.getDays();
			System.out.println("Current Month: " + m.getDays());
//			Date date = new Date();
			// post to loan transactions
			Query query = this.em.createNativeQuery(
					"insert into EMP_LOAN_TRNS(TRN_DATE,DR_AMT,CR_AMT,TRN_DESCR,EMP_CODE,VOUCHER_NO) select GETDATE(), 0,LOAN_DEDUCTION,'Loan Ded. from Salary',EMP_CODE,'SAL-DED' from MET_MAIN a");
			query.executeUpdate();
			// post to leave history
			Query query1 = this.em.createNativeQuery(
					"insert into LV_TRANS_HIST(EMP_CODE,SICK_LV,ANNUAL_LV,OTHER_LV,LV_DATE_FROM,LV_DATE_TO,ADJ_LV) "
							+ "select EMP_CODE,1.25,2.5,0,?1,?2 ,0 from EMP_MAST where EMP_DT_LEAVE  IS NULL");
			query1.setParameter(1, d1);
			query1.setParameter(2, d2);
			query1.executeUpdate();

			// set month end transaction to posted
			Query query3 = this.em.createQuery("Update MonthEndTransaction a set a.posted = 1");
			query3.executeUpdate();
			
			
			//post to salary history
			Query querySalaryHistory = this.em.createNativeQuery("insert into MET_MAIN_HIST select * from MET_MAIN a");
			querySalaryHistory.executeUpdate();
			
			//post to allowance history
			Query queryAllowanceHistory = this.em.createNativeQuery("insert into MET_ALLW_HIST select * from MET_ALLOWANCE1 a");
			queryAllowanceHistory.executeUpdate();
			
			//post to Deduction history
			Query queryDeductionHistory = this.em.createNativeQuery("insert into MET_DED_HIST select * from MET_DEDUCTION a");
			queryDeductionHistory.executeUpdate();
			
			//Delete current salary, allowance and deduction data
			Query queryDeleteAllowance = em.createQuery("DELETE FROM MonthEndAllowance m");
			queryDeleteAllowance.executeUpdate();

			Query queryDeleteSalaryDeduction = em.createQuery("DELETE FROM MonthEndDeduction m");
			queryDeleteSalaryDeduction.executeUpdate();

			Query queryDeleteSalary = em.createQuery("DELETE FROM MonthEndTransaction m");
			queryDeleteSalary.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error " + e);
			e.printStackTrace();
		}

	}

//	public void PostToSalaryHistory() {
//		Query query = this.em.createNativeQuery("insert into MET_MAIN_HIST select * from MET_MAIN a");
//		query.executeUpdate();
//
//	}

//	public void PostToAllowanceHistory() {
//		try {
//			Query query = this.em.createNativeQuery("insert into MET_ALLW_HIST select * from MET_ALLOWANCE a");
//			query.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			throw new SQLServerException("On inserting records to MET_ALLW_HIST");
//			
//		}
//		
//
//	}

//	public void PostToDeductionHistory() {
//		Query query = this.em.createNativeQuery("insert into MET_DED_HIST select * from MET_DEDUCTION a");
//		query.executeUpdate();
//
//	}

//	public void DeleteCurrentSalaryData() {
//		Query query1 = em.createQuery("DELETE FROM MonthEndAllowance m");
//		query1.executeUpdate();
//
//		Query query2 = em.createQuery("DELETE FROM MonthEndDeduction m");
//		query2.executeUpdate();
//
//		Query query3 = em.createQuery("DELETE FROM MonthEndTransaction m");
//		query3.executeUpdate();
//	}

	@Transactional
	public void CreateLeave(LeaveTransaction lt) {
		System.out.println("in CreateLeave:" + lt);
		double v_sick = 0;
		double v_annual = 0;
		double v_other = 0;
//		double v_adj = 0;
		String leaveType = "";

		leaveType = lt.getLeaveType();
		switch (leaveType) {
		case "SL":
			v_sick = lt.getNoOfWorkingdays() * -1;
			break;
		case "AL":
			v_annual = lt.getNoOfWorkingdays() * -1;
			break;
		case "OL":
			v_other = lt.getNoOfWorkingdays() * -1;
			break;
		default:
			// code block
		}

		try {
			System.out.println("save lt");
			save(lt);
		} catch (Exception e) {
			System.out.println("error  SAVING LT:" + e);
			e.printStackTrace();
		}
		try {
			System.out.println("save insert query");
			Query query = this.em.createNativeQuery(
					"insert into LV_TRANS_HIST(EMP_CODE,SICK_LV,ANNUAL_LV,OTHER_LV,LV_DATE_FROM,LV_DATE_TO,ADJ_LV) "
							+ "select ?1,?2,?3,?4,?5,?6 ,?7 ");
			query.setParameter(1, lt.getEmpCode());
			query.setParameter(2, v_sick);
			query.setParameter(3, v_annual);
			query.setParameter(4, v_other);
			query.setParameter(5, lt.getDateFrom());
			query.setParameter(6, lt.getDateTo());
			query.setParameter(7, lt.getAdjLeave());
			query.executeUpdate();
			System.out.println("Success for LV_Trans_hist insert query");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error  LV_Trans_hist insert query  and saving leave record:" + e);
			e.printStackTrace();
		}

	}

//	public void saveLT(LeaveTransaction lt) {
//		try {
//			em.persist(lt);
//			em.flush();
//			em.close();
//			System.out.println("successfully saved Leave Transaction:" + lt);
//		} catch (Exception e) {
//			System.out.println("Error on saving Leave Transaction");
//			e.printStackTrace();
//		}
//
//
//	}

	public List<Department> getAllDepartment() {
		return this.em.createQuery("Select a from Department a", Department.class).getResultList();

	}

	public List<Department> getAllDepartmentByDivision(String divisionCode) {
		System.out.println("Division Code in repo:" + divisionCode);
		return this.em.createQuery("Select a from Department a where a.divisionCode = :divisionCode", Department.class)
				.setParameter("divisionCode", divisionCode).getResultList();

	}

	/*
	 * public void fetchLoanSummary () {
	 *
	 * Query query = this.em.createNamedQuery( select max(els.TRN_ID), els.emp_code,
	 * em.emp_name, max(els.trn_date) as trn_date, sum(els.dr_amt) as total_dr,
	 * sum(els.cr_amt) as total_cr from emp_loan_trns els inner join EMP_MAST em on
	 * els.emp_code = em.EMP_CODE group by els.emp_code,em.EMP_NAME ) }
	 */

	public List<PayrollSummaryDto> getSalaryList(String divCode, String deptCode) {
		switch (divCode) {
		case "0":
			if (deptCode.equals("0")) {
				String s = "SELECT";
				s = s + " a.emp_code as empCode,";
				s = s + " a.emp_name as empName,";
				s = s + " a.dept_code as deptCode,";
				s = s + " b.dept_name as deptName,";
				s = s + " b.division_code as divCode,";
				s = s + " c.division_name as divName,";
				s = s + " a.basic_salary as basicSalary,";
				s = s + " d.attendance as attendance,";
				s = s + " d.loan_deduction as loanDeduction,";
				s = s + " d.rent_allowance as rentAllowance,";
				s = s + " d.travel_allowance as travelAllowance,";
				s = s + " d.spage_allowance as spageAllowance,";
				s = s + " d.gosi_amt as gosiAmt,";
				s = s + " d.hbank_loan as hbankLoan,";
				s = s + " d.nShift_allowance nShiftAllowance,";
				s = s + " d.other_allowance_total otherAllowance,";
				s = s + " d.other_deduction_total otherDeduction,";
				s = s + " d.late_hrs as lateHrs,";
				s = s + " d.ot_1 as ot1,";
				s = s + " d.ot_2 as ot2,";
				s = s + " g.ot_rate1 as otRate1,";
				s = s + " g.ot_rate2 as otRate2";
				s = s + " from emp_mast a, dept b, division c, met_main d,  ot_table g";
				s = s + " where a.dept_code = b.dept_code and";
				s = s + " b.division_code = c.division_code and";
				s = s + " a.emp_code = d.emp_code";
				try {
					Query query = em.createNativeQuery(s);
					List<Object[]> ls = query.getResultList();
					List<PayrollSummaryDto> dtoList = new ArrayList<>();
					for (Object[] a : ls) {
						PayrollSummaryDto els = new PayrollSummaryDto();
						els.setId((int) a[0]);
						els.setEmpName((String) a[1]);
						els.setDeptCode((String) a[2]);
						els.setDeptName((String) a[3]);
						els.setDivCode((String) a[4]);
						els.setDivName((String) a[5]);
						els.setBasicSalary((double) a[6]);
						els.setAttendance((double) a[7]);
						els.setLoanDeduction((double) a[8]);
						els.setRentAllowance((double) a[9]);
						els.setTravelAllowance((double) a[10]);
						els.setSpageAllowance((double) a[11]);
						els.setGosiAmt((double) a[12]);
						els.setHbankLoan((double) a[13]);
						els.setnShiftAllowance((double) a[14]);
						els.setOtherAllowanceTotal((double) a[15]);
						els.setOtherDeductionTotal((double) a[16]);
						els.setLateHrs((double) a[17]);
						els.setOt1((double) a[18]);
						els.setOt2((double) a[19]);
						els.setOtRate1((double) a[20]);
						els.setOtRate2((double) a[21]);
						dtoList.add(els);
					}
					return dtoList;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} else {
//				return this.em
//						.createQuery("Select a from PayrollSummary a where a.divCode = :divCode ", PayrollSummary.class)
//						.setParameter("divCode", divCode).getResultList();

			}

		default:
//			if (deptCode.equals("0")) {
//				return this.em
//						.createQuery("Select a from PayrollSummary a where a.divCode = :divCode ", PayrollSummary.class)
//						.setParameter("divCode", divCode).getResultList();
//			} else {
//				return this.em
//						.createQuery(
//								"Select a from PayrollSummary a where a.divCode = :divCode and a.deptCode = :deptCode",
//								PayrollSummary.class)
//						.setParameter("divCode", divCode).setParameter("deptCode", deptCode).getResultList();
//			}

		}
//
		return null;
	}
}
