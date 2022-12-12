package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


public class EmpLoanSummaryDto  implements Serializable{

	private static final long serialVersionUID = 5676099310140147179L;
	private int empcode;
	private BigDecimal drAmountTotal;
	private BigDecimal crAmountTotal;
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
	public BigDecimal getDrAmountTotal() {
		return drAmountTotal;
	}
	public void setDrAmountTotal(BigDecimal drAmountTotal) {
		this.drAmountTotal = drAmountTotal;
	}
	public BigDecimal getCrAmountTotal() {
		return crAmountTotal;
	}
	public void setCrAmountTotal(BigDecimal crAmountTotal) {
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
	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, crAmountTotal, drAmountTotal, empcode, indeminity, lastTrnDate,
				loanInstallment);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		EmpLoanSummaryDto other = (EmpLoanSummaryDto) obj;
		return Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary)
				&& Objects.equals(crAmountTotal, other.crAmountTotal)
				&& Objects.equals(drAmountTotal, other.drAmountTotal) && empcode == other.empcode
				&& Double.doubleToLongBits(indeminity) == Double.doubleToLongBits(other.indeminity)
				&& Objects.equals(lastTrnDate, other.lastTrnDate)
				&& Double.doubleToLongBits(loanInstallment) == Double.doubleToLongBits(other.loanInstallment);
	}







}
