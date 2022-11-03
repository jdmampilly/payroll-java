package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PRS1")
public class PayrollSummary implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="emp_code")
	private int id;
	@Column(name="emp_name")
	private String empName;
	@Column(name="dept_code")
	private String deptCode;
	@Column(name="dept_name")
	private String deptName;
	@Column(name="division_code")
	private String divCode;
	@Column(name="division_name")
	private String divName;
	@Column(name="basic_salary")
	private double basicSalary;
	@Column(name="attendance")
	private double attendance;
	@Column(name="loan_deduction")
	private double loanDeduction;
	@Column(name="rent_allowance")
	private double rentAllowance;
	@Column(name="travel_allowance")
	private double travelAllowance;
	@Column(name="spage_allowance")
	private double spageAllowance;
	@Column(name="gosi_amt")
	private double gosiAmt;
	@Column(name="hbank_loan")
	private double hbankLoan;
	@Column(name="nShift_allowance")
	private double nShiftAllowance;
	@Column(name="other_allowance_total")
	private double otherAllowanceTotal;
	@Column(name="other_deduction_total")
	private double otherDeductionTotal;
	@Column(name="late_hrs")
	private double lateHrs;
	@Column(name="ot_1")
	private double ot1;
	@Column(name="ot_2")
	private double ot2;
	@Column(name="ot_rate1")
	private double otRate1;
	@Column(name="ot_rate2")
	private double otRate2;
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
	@Override
	public int hashCode() {
		return Objects.hash(attendance, basicSalary, deptCode, deptName, divCode, divName, empName, gosiAmt, hbankLoan,
				id, lateHrs, loanDeduction, nShiftAllowance, ot1, ot2, otRate1, otRate2, otherAllowanceTotal,
				otherDeductionTotal, rentAllowance, spageAllowance, travelAllowance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayrollSummary other = (PayrollSummary) obj;
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
		return "PayrollSummary [id=" + id + ", empName=" + empName + ", deptCode=" + deptCode + ", deptName=" + deptName
				+ ", divCode=" + divCode + ", divName=" + divName + ", basicSalary=" + basicSalary + ", attendance="
				+ attendance + ", loanDeduction=" + loanDeduction + ", rentAllowance=" + rentAllowance
				+ ", travelAllowance=" + travelAllowance + ", spageAllowance=" + spageAllowance + ", gosiAmt=" + gosiAmt
				+ ", hbankLoan=" + hbankLoan + ", nShiftAllowance=" + nShiftAllowance + ", otherAllowanceTotal="
				+ otherAllowanceTotal + ", otherDeductionTotal=" + otherDeductionTotal + ", lateHrs=" + lateHrs
				+ ", ot1=" + ot1 + ", ot2=" + ot2 + ", otRate1=" + otRate1 + ", otRate2=" + otRate2 + "]";
	}
	
		
	
	
	
	
	
	
	
	
	
	
	

}
