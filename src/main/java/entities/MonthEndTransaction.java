package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="MonthEndTransaction")
public class MonthEndTransaction  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="empCode")
	private int empCode;
	@Transient
	private String empName;
	@Column(name="trnYear")
	private int trnYear;
	@Column(name="trnMonth")
	private int trnMonth;
	@Transient
	private String monthName;
	@Column(name="attendance")
	private double attendance;
	@Column(name="basicSalary")
	private double basicSalary;
	@Column(name="rentAllowance")
	private double rentAllowance;
	@Column(name="spageAllowance")
	private double spageAllowance;
	@Column(name="travelAllowance")
	private double travelAllowance;
	@Column(name="otherAllowanceTotal")
	private double otherAllowanceTotal;
	@Column(name="gosiAmount")
	private double gosiAmount;
	@Column(name="hBankLoan")
	private double hBankLoan;
	@Column(name="loanDeduction")
	private double loanDeduction;
	@Column(name="otherDeductionTotal")
	private double otherDeductionTotal;
	@Column(name="bankCode")
	private String bankCode;
	@Column(name="bankAcNo")
	private String bankAcNo;
	@Column(name="ot1")
	private double ot1;
	@Column(name="ot2")
	private double ot2;
	@Column(name="nShiftAllowance")
	private double nShiftAllowance;
	@Column(name="lateHours")
	private double lateHours;
	@Transient
	private List<MonthEndAllowance> otherAllowances;
	@Transient
	private List<MonthEndDeduction> otherDeductions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getTrnYear() {
		return trnYear;
	}
	public void setTrnYear(int trnYear) {
		this.trnYear = trnYear;
	}
	public int getTrnMonth() {
		return trnMonth;
	}
	public void setTrnMonth(int trnMonth) {
		this.trnMonth = trnMonth;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public double getAttendance() {
		return attendance;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getRentAllowance() {
		return rentAllowance;
	}
	public void setRentAllowance(double rentAllowance) {
		this.rentAllowance = rentAllowance;
	}
	public double getSpageAllowance() {
		return spageAllowance;
	}
	public void setSpageAllowance(double spageAllowance) {
		this.spageAllowance = spageAllowance;
	}
	public double getTravelAllowance() {
		return travelAllowance;
	}
	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	public double getOtherAllowanceTotal() {
		return otherAllowanceTotal;
	}
	public void setOtherAllowanceTotal(double otherAllowanceTotal) {
		this.otherAllowanceTotal = otherAllowanceTotal;
	}
	public double getGosiAmount() {
		return gosiAmount;
	}
	public void setGosiAmount(double gosiAmount) {
		this.gosiAmount = gosiAmount;
	}
	public double gethBankLoan() {
		return hBankLoan;
	}
	public void sethBankLoan(double hBankLoan) {
		this.hBankLoan = hBankLoan;
	}
	public double getLoanDeduction() {
		return loanDeduction;
	}
	public void setLoanDeduction(double loanDeduction) {
		this.loanDeduction = loanDeduction;
	}
	public double getOtherDeductionTotal() {
		return otherDeductionTotal;
	}
	public void setOtherDeductionTotal(double otherDeductionTotal) {
		this.otherDeductionTotal = otherDeductionTotal;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankAcNo() {
		return bankAcNo;
	}
	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
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
	public double getnShiftAllowance() {
		return nShiftAllowance;
	}
	public void setnShiftAllowance(double nShiftAllowance) {
		this.nShiftAllowance = nShiftAllowance;
	}
	public double getLateHours() {
		return lateHours;
	}
	public void setLateHours(double lateHours) {
		this.lateHours = lateHours;
	}
	public List<MonthEndAllowance> getOtherAllowances() {
		return otherAllowances;
	}
	public void setOtherAllowances(List<MonthEndAllowance> otherAllowances) {
		this.otherAllowances = otherAllowances;
	}
	public List<MonthEndDeduction> getOtherDeductions() {
		return otherDeductions;
	}
	public void setOtherDeductions(List<MonthEndDeduction> otherDeductions) {
		this.otherDeductions = otherDeductions;
	}
	@Override
	public int hashCode() {
		return Objects.hash(attendance, bankAcNo, bankCode, basicSalary, empCode, empName, gosiAmount, hBankLoan, id,
				lateHours, loanDeduction, monthName, nShiftAllowance, ot1, ot2, otherAllowanceTotal, otherAllowances,
				otherDeductionTotal, otherDeductions, rentAllowance, spageAllowance, travelAllowance, trnMonth,
				trnYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonthEndTransaction other = (MonthEndTransaction) obj;
		return Double.doubleToLongBits(attendance) == Double.doubleToLongBits(other.attendance)
				&& Objects.equals(bankAcNo, other.bankAcNo) && Objects.equals(bankCode, other.bankCode)
				&& Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary)
				&& empCode == other.empCode && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(gosiAmount) == Double.doubleToLongBits(other.gosiAmount)
				&& Double.doubleToLongBits(hBankLoan) == Double.doubleToLongBits(other.hBankLoan) && id == other.id
				&& Double.doubleToLongBits(lateHours) == Double.doubleToLongBits(other.lateHours)
				&& Double.doubleToLongBits(loanDeduction) == Double.doubleToLongBits(other.loanDeduction)
				&& Objects.equals(monthName, other.monthName)
				&& Double.doubleToLongBits(nShiftAllowance) == Double.doubleToLongBits(other.nShiftAllowance)
				&& Double.doubleToLongBits(ot1) == Double.doubleToLongBits(other.ot1)
				&& Double.doubleToLongBits(ot2) == Double.doubleToLongBits(other.ot2)
				&& Double.doubleToLongBits(otherAllowanceTotal) == Double.doubleToLongBits(other.otherAllowanceTotal)
				&& Objects.equals(otherAllowances, other.otherAllowances)
				&& Double.doubleToLongBits(otherDeductionTotal) == Double.doubleToLongBits(other.otherDeductionTotal)
				&& Objects.equals(otherDeductions, other.otherDeductions)
				&& Double.doubleToLongBits(rentAllowance) == Double.doubleToLongBits(other.rentAllowance)
				&& Double.doubleToLongBits(spageAllowance) == Double.doubleToLongBits(other.spageAllowance)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance)
				&& trnMonth == other.trnMonth && trnYear == other.trnYear;
	}
	@Override
	public String toString() {
		return "MonthEndTransaction [id=" + id + ", empCode=" + empCode + ", empName=" + empName + ", trnYear="
				+ trnYear + ", trnMonth=" + trnMonth + ", monthName=" + monthName + ", attendance=" + attendance
				+ ", basicSalary=" + basicSalary + ", rentAllowance=" + rentAllowance + ", spageAllowance="
				+ spageAllowance + ", travelAllowance=" + travelAllowance + ", otherAllowanceTotal="
				+ otherAllowanceTotal + ", gosiAmount=" + gosiAmount + ", hBankLoan=" + hBankLoan + ", loanDeduction="
				+ loanDeduction + ", otherDeductionTotal=" + otherDeductionTotal + ", bankCode=" + bankCode
				+ ", bankAcNo=" + bankAcNo + ", ot1=" + ot1 + ", ot2=" + ot2 + ", nShiftAllowance=" + nShiftAllowance
				+ ", lateHours=" + lateHours + ", otherAllowances=" + otherAllowances + ", otherDeductions="
				+ otherDeductions + "]";
	}
	
	
	
	

}
