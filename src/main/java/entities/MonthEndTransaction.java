package entities;

import java.io.Serializable;

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(attendance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankAcNo == null) ? 0 : bankAcNo.hashCode());
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empCode;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		temp = Double.doubleToLongBits(gosiAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hBankLoan);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		temp = Double.doubleToLongBits(lateHours);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(loanDeduction);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((monthName == null) ? 0 : monthName.hashCode());
		temp = Double.doubleToLongBits(nShiftAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ot1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ot2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(otherAllowanceTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(otherDeductionTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rentAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(spageAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(travelAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + trnMonth;
		result = prime * result + trnYear;
		return result;
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
		if (Double.doubleToLongBits(attendance) != Double.doubleToLongBits(other.attendance))
			return false;
		if (bankAcNo == null) {
			if (other.bankAcNo != null)
				return false;
		} else if (!bankAcNo.equals(other.bankAcNo))
			return false;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		if (empCode != other.empCode)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.doubleToLongBits(gosiAmount) != Double.doubleToLongBits(other.gosiAmount))
			return false;
		if (Double.doubleToLongBits(hBankLoan) != Double.doubleToLongBits(other.hBankLoan))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(lateHours) != Double.doubleToLongBits(other.lateHours))
			return false;
		if (Double.doubleToLongBits(loanDeduction) != Double.doubleToLongBits(other.loanDeduction))
			return false;
		if (monthName == null) {
			if (other.monthName != null)
				return false;
		} else if (!monthName.equals(other.monthName))
			return false;
		if (Double.doubleToLongBits(nShiftAllowance) != Double.doubleToLongBits(other.nShiftAllowance))
			return false;
		if (Double.doubleToLongBits(ot1) != Double.doubleToLongBits(other.ot1))
			return false;
		if (Double.doubleToLongBits(ot2) != Double.doubleToLongBits(other.ot2))
			return false;
		if (Double.doubleToLongBits(otherAllowanceTotal) != Double.doubleToLongBits(other.otherAllowanceTotal))
			return false;
		if (Double.doubleToLongBits(otherDeductionTotal) != Double.doubleToLongBits(other.otherDeductionTotal))
			return false;
		if (Double.doubleToLongBits(rentAllowance) != Double.doubleToLongBits(other.rentAllowance))
			return false;
		if (Double.doubleToLongBits(spageAllowance) != Double.doubleToLongBits(other.spageAllowance))
			return false;
		if (Double.doubleToLongBits(travelAllowance) != Double.doubleToLongBits(other.travelAllowance))
			return false;
		if (trnMonth != other.trnMonth)
			return false;
		if (trnYear != other.trnYear)
			return false;
		return true;
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
				+ ", lateHours=" + lateHours + "]";
	}
	
	
	
	

}
