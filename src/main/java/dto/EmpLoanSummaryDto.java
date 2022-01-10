package dto;

import java.io.Serializable;
import java.util.Date;


public class EmpLoanSummaryDto  implements Serializable{

	private static final long serialVersionUID = 5676099310140147179L;
	private int empcode;
	private double drAmount;
	private double crAmount;
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
	public double getDrAmount() {
		return drAmount;
	}
	public void setDrAmount(double drAmount) {
		this.drAmount = drAmount;
	}
	public double getCrAmount() {
		return crAmount;
	}
	public void setCrAmount(double crAmount) {
		this.crAmount = crAmount;
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
	public EmpLoanSummaryDto(int empcode, double drAmount, double crAmount, Date lastTrnDate, double loanInstallment,
			double basicSalary, double indeminity) {
		super();
		this.empcode = empcode;
		this.drAmount = drAmount;
		this.crAmount = crAmount;
		this.lastTrnDate = lastTrnDate;
		this.loanInstallment = loanInstallment;
		this.basicSalary = basicSalary;
		this.indeminity = indeminity;
	}
	

	
	

}
