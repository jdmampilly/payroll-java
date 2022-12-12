package dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;

public class PayrollSummaryDto implements Serializable {

	private static final long serialVersionUID = 78696552375406101L;
	@Id
	private int id;
	private String empName;
	private String deptCode;
	private String deptName;
	private String divCode;
	private String divName;
	private double basicSalary;
	private double attendance;
	private double loanDeduction;
	private double rentAllowance;
	private double travelAllowance;
	private double spageAllowance;
	private double gosiAmt;
	private double hbankLoan;
	private double nShiftAllowance;
	private double otherAllowanceTotal;
	private double otherDeductionTotal;
	private double lateHrs;
	private double ot1;
	private double ot2;
	private double otRate1;
	private double otRate2;
	private double ot1Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDivCode() {
		return divCode;
	}
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getAttendance() {
		return attendance;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	public double getLoanDeduction() {
		return loanDeduction;
	}
	public void setLoanDeduction(double loanDeduction) {
		this.loanDeduction = loanDeduction;
	}
	public double getRentAllowance() {
		return rentAllowance;
	}
	public void setRentAllowance(double rentAllowance) {
		this.rentAllowance = rentAllowance;
	}
	public double getTravelAllowance() {
		return travelAllowance;
	}
	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	public double getSpageAllowance() {
		return spageAllowance;
	}
	public void setSpageAllowance(double spageAllowance) {
		this.spageAllowance = spageAllowance;
	}
	public double getGosiAmt() {
		return gosiAmt;
	}
	public void setGosiAmt(double gosiAmt) {
		this.gosiAmt = gosiAmt;
	}
	public double getHbankLoan() {
		return hbankLoan;
	}
	public void setHbankLoan(double hbankLoan) {
		this.hbankLoan = hbankLoan;
	}
	public double getnShiftAllowance() {
		return nShiftAllowance;
	}
	public void setnShiftAllowance(double nShiftAllowance) {
		this.nShiftAllowance = nShiftAllowance;
	}
	public double getOtherAllowanceTotal() {
		return otherAllowanceTotal;
	}
	public void setOtherAllowanceTotal(double otherAllowanceTotal) {
		this.otherAllowanceTotal = otherAllowanceTotal;
	}
	public double getOtherDeductionTotal() {
		return otherDeductionTotal;
	}
	public void setOtherDeductionTotal(double otherDeductionTotal) {
		this.otherDeductionTotal = otherDeductionTotal;
	}
	public double getLateHrs() {
		return lateHrs;
	}
	public void setLateHrs(double lateHrs) {
		this.lateHrs = lateHrs;
	}
	public double getOt1() {
		return ot1;
	}
	public void setOt1(double ot1) {
		this.ot1 = ot1;
	}
	public double getOt2() {
		return ot2;
	}
	public void setOt2(double ot2) {
		this.ot2 = ot2;
	}
	public double getOtRate1() {
		return otRate1;
	}
	public void setOtRate1(double otRate1) {
		this.otRate1 = otRate1;
	}
	public double getOtRate2() {
		return otRate2;
	}
	public void setOtRate2(double otRate2) {
		this.otRate2 = otRate2;
	}
	public double getOt1Total() {
		return ot1Total;
	}
	public void setOt1Total(double ot1Total) {
		this.ot1Total = ot1Total;
	}
	@Override
	public int hashCode() {
		return Objects.hash(attendance, basicSalary, deptCode, deptName, divCode, divName, empName, gosiAmt, hbankLoan,
				id, lateHrs, loanDeduction, nShiftAllowance, ot1, ot1Total, ot2, otRate1, otRate2, otherAllowanceTotal,
				otherDeductionTotal, rentAllowance, spageAllowance, travelAllowance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		PayrollSummaryDto other = (PayrollSummaryDto) obj;
		return Double.doubleToLongBits(attendance) == Double.doubleToLongBits(other.attendance)
				&& Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(deptName, other.deptName)
				&& Objects.equals(divCode, other.divCode) && Objects.equals(divName, other.divName)
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(gosiAmt) == Double.doubleToLongBits(other.gosiAmt)
				&& Double.doubleToLongBits(hbankLoan) == Double.doubleToLongBits(other.hbankLoan) && id == other.id
				&& Double.doubleToLongBits(lateHrs) == Double.doubleToLongBits(other.lateHrs)
				&& Double.doubleToLongBits(loanDeduction) == Double.doubleToLongBits(other.loanDeduction)
				&& Double.doubleToLongBits(nShiftAllowance) == Double.doubleToLongBits(other.nShiftAllowance)
				&& Double.doubleToLongBits(ot1) == Double.doubleToLongBits(other.ot1)
				&& Double.doubleToLongBits(ot1Total) == Double.doubleToLongBits(other.ot1Total)
				&& Double.doubleToLongBits(ot2) == Double.doubleToLongBits(other.ot2)
				&& Double.doubleToLongBits(otRate1) == Double.doubleToLongBits(other.otRate1)
				&& Double.doubleToLongBits(otRate2) == Double.doubleToLongBits(other.otRate2)
				&& Double.doubleToLongBits(otherAllowanceTotal) == Double.doubleToLongBits(other.otherAllowanceTotal)
				&& Double.doubleToLongBits(otherDeductionTotal) == Double.doubleToLongBits(other.otherDeductionTotal)
				&& Double.doubleToLongBits(rentAllowance) == Double.doubleToLongBits(other.rentAllowance)
				&& Double.doubleToLongBits(spageAllowance) == Double.doubleToLongBits(other.spageAllowance)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance);
	}
	@Override
	public String toString() {
		return "PayrollSummaryDto [id=" + id + ", empName=" + empName + ", deptCode=" + deptCode + ", deptName="
				+ deptName + ", divCode=" + divCode + ", divName=" + divName + ", basicSalary=" + basicSalary
				+ ", attendance=" + attendance + ", loanDeduction=" + loanDeduction + ", rentAllowance=" + rentAllowance
				+ ", travelAllowance=" + travelAllowance + ", spageAllowance=" + spageAllowance + ", gosiAmt=" + gosiAmt
				+ ", hbankLoan=" + hbankLoan + ", nShiftAllowance=" + nShiftAllowance + ", otherAllowanceTotal="
				+ otherAllowanceTotal + ", otherDeductionTotal=" + otherDeductionTotal + ", lateHrs=" + lateHrs
				+ ", ot1=" + ot1 + ", ot2=" + ot2 + ", otRate1=" + otRate1 + ", otRate2=" + otRate2 + ", ot1Total="
				+ ot1Total + "]";
	}




}
