package dto;

import java.io.Serializable;
import java.util.Date;


public class EmpLoanSummaryDto  implements Serializable{

	private static final long serialVersionUID = 5676099310140147179L;
	private int empcode;
	private double drAmountTotal;
	private double crAmountTotal;
	private Date lastTrnDate;
	private double loanInstallment;
	private double basicSalary;
	private double indeminity;
	
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public double getDrAmountTotal() {
		return drAmountTotal;
	}
	public void setDrAmountTotal(double drAmountTotal) {
		this.drAmountTotal = drAmountTotal;
	}
	public double getCrAmountTotal() {
		return crAmountTotal;
	}
	public void setCrAmountTotal(double crAmountTotal) {
		this.crAmountTotal = crAmountTotal;
	}
	public Date getLastTrnDate() {
		return lastTrnDate;
	}
	public void setLastTrnDate(Date lastTrnDate) {
		this.lastTrnDate = lastTrnDate;
	}
	public double getLoanInstallment() {
		return loanInstallment;
	}
	public void setLoanInstallment(double loanInstallment) {
		this.loanInstallment = loanInstallment;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getIndeminity() {
		return indeminity;
	}
	public void setIndeminity(double indeminity) {
		this.indeminity = indeminity;
	}
	public EmpLoanSummaryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpLoanSummaryDto(int empcode, double drAmountTotal, double crAmountTotal, Date lastTrnDate, double loanInstallment,
			double basicSalary, double indeminity) {
		super();
		this.empcode = empcode;
		this.drAmountTotal = drAmountTotal;
		this.crAmountTotal = crAmountTotal;
		this.lastTrnDate = lastTrnDate;
		this.loanInstallment = loanInstallment;
		this.basicSalary = basicSalary;
		this.indeminity = indeminity;
	}
	

	
	

}
