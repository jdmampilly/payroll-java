package services;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import entities.Employee;
import entities.LoanMaster;
import entities.Month;
import entities.MonthEndTransaction;
import exception.DataNotFoundException;
import repositories.PayrollRepository;
import repositories.SalaryRepository;

@Stateless
public class SalaryService implements Serializable {

	private static final long serialVersionUID = 7508312817184312175L;
	@EJB
	SalaryRepository repo;
	@EJB
	PayrollRepository payrollRepo;

	public List<MonthEndTransaction> getAllEmployeeSalaryList(Class<MonthEndTransaction> clazz) {
		List<MonthEndTransaction> l = repo.getAllEmployeeSalaryList(clazz);
		return l;
	}

	public MonthEndTransaction getEmployeeSalary(int empCode) {
		MonthEndTransaction m = new MonthEndTransaction();
		try {
			m = repo.getEmployeeSalary(empCode);
		} catch (Exception e) {

		}
		try {
			Employee emp = payrollRepo.getById(Employee.class, empCode);
			Month month = payrollRepo.getByKey(Month.class, "status", "A");
			LoanMaster l = new LoanMaster();
			try {
				l = payrollRepo.getByKey(LoanMaster.class,"empCode", empCode);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("No result: " + e.getMessage());
			}
			
			if (m.getEmpCode() == 0) {
				m.setEmpCode(emp.getId());
				m.setEmpName(emp.getEmpName());
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
				m.setLoanDeduction(l.getLoanInstallment());

			} else {
				m.setEmpName(emp.getEmpName());
				m.setMonthName(month.getMonthName());
			}

		} catch (Exception e) {
			throw new DataNotFoundException("Data not found for empCode: " + empCode);
		}

		return m;
	}
	
	

}
