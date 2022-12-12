package services;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dto.EmpLoanSummaryDto;
import entities.Employee;
import entities.LoanSummaryView;
import repositories.PayrollRepository;
import repositories.SalaryRepository;

@Stateless
public class EmployeeService implements Serializable {

	private static final long serialVersionUID = 5122558391956505126L;
	@EJB
	SalaryRepository salaryRepo;
	@EJB
	PayrollRepository payrollRepo;

	public EmpLoanSummaryDto calculateEmpLoanInfo(int empCode) {
		System.out.println("ïn calculateEmpLoanInfo");
		EmpLoanSummaryDto e = new EmpLoanSummaryDto();
//		e = payrollRepo.getByKey(EmployeeLoanSummaryView.class, "empCode", empCode)

		try {
			e =  payrollRepo.getEmpLoanSummary(empCode);
			System.out.println("employee loan summary:" + e);
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("employee loan summary error:" +e2.getMessage());
		}
//
		EmpLoanSummaryDto eDto = new EmpLoanSummaryDto();
		if (e != null) {
			System.out.println("employee loan summary:" + e);
			eDto.setEmpcode(empCode);
			eDto.setDrAmountTotal(e.getDrAmountTotal());
			eDto.setCrAmountTotal(e.getCrAmountTotal());
			eDto.setLastTrnDate(e.getLastTrnDate());

		} else {
			System.out.println("e is null");
		}
//		eDto.setEmpcode(empCode);
		Employee emp = payrollRepo.getById(Employee.class, empCode);
		eDto.setLoanInstallment(emp.getLoanInstallment());
//		try {
////			LoanMaster lm = payrollRepo.getByKey(LoanMaster.class, "empCode", empCode);
//			emp = payrollRepo.getByKey(Employee.class, "empCode", empCode);
//			eDto.setLoanInstallment(emp.getLoanInstallment());
//		} catch (Exception e2) {
//			// TODO: handle exception
//		}
		eDto.setBasicSalary(emp.getBasicSalary());
		eDto.setIndeminity(calculateIndeminity(emp));
		System.out.println("Employee loan summary:" +eDto);
		return eDto;

	}

	public LoanSummaryView getEmpLoanInfo(int empCode) {

		return payrollRepo.getById(LoanSummaryView.class, empCode);

	}

	private double calculateIndeminity(Employee e) {

		double noOfDays;
		double noOfDays2;
		LocalDate endDate = null;
		double indeminity1 = 0;
		double indeminity2 = 0;
		double basicSalary = e.getBasicSalary();
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Instant instant = e.getOnBoardingDate().toInstant();
		LocalDate startDate = instant.atZone(defaultZoneId).toLocalDate();
		endDate = LocalDate.now();
		noOfDays = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("Indeminity calculation in calculateIndeminity.........");
		if (noOfDays < 1095) {
			indeminity1 = (basicSalary / 2) / 365 * noOfDays;
		}
		if (noOfDays > 1095) {
			indeminity1 = (basicSalary / 2) / 365 * noOfDays;
			noOfDays2 = noOfDays - 1095;
			indeminity2 = (basicSalary) / 365 * noOfDays2;
		}
		System.out.println("No of Days:" + noOfDays);
		System.out.println("Indeminity1:" + indeminity1);
		System.out.println("Indeminity2:" + indeminity2);
		DecimalFormat newFormat = new DecimalFormat("#.###");
		return Double.valueOf(newFormat.format(indeminity1 + indeminity2));
//		return  indeminity1 + indeminity2;
	}

}
