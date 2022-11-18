package services;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.RollbackException;

import entities.Employee;
import entities.EmployeeView;
import entities.Month;
import entities.MonthEndAllowance;
import entities.MonthEndDeduction;
import entities.MonthEndTransaction;
import entities.PayrollSummaryView;
import entities.SalaryIncrement;
import exception.DataNotFoundException;
import repositories.PayrollRepository;
import repositories.SalaryRepository;

@Stateless
@TransactionManagement(value = TransactionManagementType.BEAN)
public class SalaryService implements Serializable {

	private static final long serialVersionUID = 7508312817184312175L;
	@EJB
	SalaryRepository repo;
	@EJB
	PayrollRepository payrollRepo;
	@Resource
	private UserTransaction utx;

	public List<MonthEndTransaction> getAllEmployeeSalaryList(Class<MonthEndTransaction> clazz) {
		List<MonthEndTransaction> l = repo.getAllEmployeeSalaryList(clazz);
		return l;
	}

	public MonthEndTransaction getEmployeeSalary(int empCode) {
		MonthEndTransaction m = new MonthEndTransaction();
		List<MonthEndAllowance> mea = null;
		try {
			m = repo.getEmployeeSalary(empCode);
			mea = repo.getMEA(empCode);
		} catch (Exception e) {

		}
		try {
			EmployeeView emp = new EmployeeView();
			emp = payrollRepo.getById(EmployeeView.class, empCode);
			Month month = payrollRepo.getByKey(Month.class, "status", "current");
//			LoanMaster l = new LoanMaster();
//			try {
//				l = payrollRepo.getByKey(LoanMaster.class,"empCode", empCode);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("No result: " + e.getMessage());
//			}

			if (m.getId() == 0) {
				m.setId(emp.getEmpCode());
				m.setEmpName(emp.getEmpName());
				m.setDepartmentName(emp.getDeptName());
				m.setBasicSalary(emp.getBasicSalary());
				m.setAttendance(30);
				m.setBankAcNo(emp.getAcNumber());
				m.setGosiAmount(emp.getGosiAmount());
				m.sethBankLoan(emp.getHousingBankAmount());
				m.setTrnMonth(month.getMonth());
				m.setTrnYear(month.getYear());
				m.setMonthName(month.getMonthName());
				m.setRentAllowance(emp.getRentAllowance());
				m.setTravelAllowance(emp.getTravelAllowance());
				m.setSpageAllowance(emp.getSpecialAllowance());
				m.setLoanDeduction(emp.getLoanInstallment());
				m.sethBankLoan(emp.getHousingBankAmount());

			} else {
				m.setEmpName(emp.getEmpName());
				m.setMonthName(month.getMonthName());
				m.setDepartmentName(emp.getDeptName());
//				m.setOtherAllowances(repo.getMEA(m.getId()));
//				m.setOtherDeductions(repo.getMED(m.getId()));
			}

		} catch (Exception e) {
			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

		return m;
	}

	public void save(MonthEndTransaction met, List<MonthEndAllowance> mea, List<MonthEndDeduction> med)
			throws NotSupportedException, SystemException {
		// TODO Auto-generated method stub
		System.out.println("save in salary service");
		try {
			utx.begin();
			repo.save(met, mea, med);
			utx.commit();
		} catch (RollbackException re) {
			System.out.println("Rollback....");
//			hrq.setHrNo("Error");
			utx.rollback();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (javax.transaction.RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveSalaryIncrement(SalaryIncrement inc) throws Exception {
		try {
			utx.begin();
			payrollRepo.save(inc);
			payrollRepo.salaryIncrement(inc);
			utx.commit();
		} catch (RollbackException re) {
			System.out.println("Rollback....");
			utx.rollback();
			re.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<PayrollSummaryView> getSalaryList(String divisionCode, String deptCode) {
		return repo.getSalaryList(divisionCode, deptCode);
	}

	public List<MonthEndAllowance> getEmployeeMea(int id) {
		// TODO Auto-generated method stub
		return repo.getMEA(id);
	}

	public List<MonthEndDeduction> getEmployeeMed(int id) {
		// TODO Auto-generated method stub
		return repo.getMED(id);
	}

}
