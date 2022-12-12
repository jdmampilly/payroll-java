package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_payroll_summary")
@Cacheable(false)
public class PayrollSummaryView implements Serializable {

	private static final long serialVersionUID = -8663417858951369019L;
	@Id
	@Column(name="emp_code")
	private int id;
	@Column(name="emp_name")
	private String empName;
	@Column(name="division_code")
	private String divCode;
	@Column(name="division_name")
	private String divName;
	@Column(name="dept_code")
	private String deptCode;
	@Column(name="dept_name")
	private String deptName;
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
	@Column(name="ot_total")
	private double otTotal;
	@Column(name="sub_total")
	private double subTotal;
	@Column(name ="net_salary")
	private double netSalary;
	@Column(name="BANK_CODE")
	private String bankCode;
	@Column(name="lateHoursAmount")
	private double lateHoursAmount;
	@Column(name="AC_NO")
	private String accountNo;
	@Column(name="total_deductions")
	private double totalDeductions;
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
	public double getOtTotal() {
		return otTotal;
	}
	public void setOtTotal(double otTotal) {
		this.otTotal = otTotal;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public double getLateHoursAmount() {
		return lateHoursAmount;
	}
	public void setLateHoursAmount(double lateHoursAmount) {
		this.lateHoursAmount = lateHoursAmount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getTotalDeductions() {
		return totalDeductions;
	}
	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNo, attendance, bankCode, basicSalary, deptCode, deptName, divCode, divName, empName,
				gosiAmt, hbankLoan, id, lateHoursAmount, lateHrs, loanDeduction, nShiftAllowance, netSalary, otTotal,
				otherAllowanceTotal, otherDeductionTotal, rentAllowance, spageAllowance, subTotal, totalDeductions,
				travelAllowance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayrollSummaryView other = (PayrollSummaryView) obj;
		return Objects.equals(accountNo, other.accountNo)
				&& Double.doubleToLongBits(attendance) == Double.doubleToLongBits(other.attendance)
				&& Objects.equals(bankCode, other.bankCode)
				&& Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(deptName, other.deptName)
				&& Objects.equals(divCode, other.divCode) && Objects.equals(divName, other.divName)
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(gosiAmt) == Double.doubleToLongBits(other.gosiAmt)
				&& Double.doubleToLongBits(hbankLoan) == Double.doubleToLongBits(other.hbankLoan) && id == other.id
				&& Double.doubleToLongBits(lateHoursAmount) == Double.doubleToLongBits(other.lateHoursAmount)
				&& Double.doubleToLongBits(lateHrs) == Double.doubleToLongBits(other.lateHrs)
				&& Double.doubleToLongBits(loanDeduction) == Double.doubleToLongBits(other.loanDeduction)
				&& Double.doubleToLongBits(nShiftAllowance) == Double.doubleToLongBits(other.nShiftAllowance)
				&& Double.doubleToLongBits(netSalary) == Double.doubleToLongBits(other.netSalary)
				&& Double.doubleToLongBits(otTotal) == Double.doubleToLongBits(other.otTotal)
				&& Double.doubleToLongBits(otherAllowanceTotal) == Double.doubleToLongBits(other.otherAllowanceTotal)
				&& Double.doubleToLongBits(otherDeductionTotal) == Double.doubleToLongBits(other.otherDeductionTotal)
				&& Double.doubleToLongBits(rentAllowance) == Double.doubleToLongBits(other.rentAllowance)
				&& Double.doubleToLongBits(spageAllowance) == Double.doubleToLongBits(other.spageAllowance)
				&& Double.doubleToLongBits(subTotal) == Double.doubleToLongBits(other.subTotal)
				&& Double.doubleToLongBits(totalDeductions) == Double.doubleToLongBits(other.totalDeductions)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance);
	}
	@Override
	public String toString() {
		return "PayrollSummaryView [id=" + id + ", empName=" + empName + ", divCode=" + divCode + ", divName=" + divName
				+ ", deptCode=" + deptCode + ", deptName=" + deptName + ", basicSalary=" + basicSalary + ", attendance="
				+ attendance + ", loanDeduction=" + loanDeduction + ", rentAllowance=" + rentAllowance
				+ ", travelAllowance=" + travelAllowance + ", spageAllowance=" + spageAllowance + ", gosiAmt=" + gosiAmt
				+ ", hbankLoan=" + hbankLoan + ", nShiftAllowance=" + nShiftAllowance + ", otherAllowanceTotal="
				+ otherAllowanceTotal + ", otherDeductionTotal=" + otherDeductionTotal + ", lateHrs=" + lateHrs
				+ ", otTotal=" + otTotal + ", subTotal=" + subTotal + ", netSalary=" + netSalary + ", bankCode="
				+ bankCode + ", lateHoursAmount=" + lateHoursAmount + ", accountNo=" + accountNo + ", totalDeductions="
				+ totalDeductions + "]";
	}
	
	


}
