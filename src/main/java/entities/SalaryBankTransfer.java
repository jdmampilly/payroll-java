package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vw_bankTransfer")
public class SalaryBankTransfer implements Serializable{

	private static final long serialVersionUID = -406926649813942950L;
	@Id
	@Column(name="emp_code")
	private int empCode;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="bank_code")
	private String bankCode;
	@Column(name="ac_no")
	private String accountNo;
	@Column(name="net_salary")
	private double netSalary;
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
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNo, bankCode, empCode, empName, netSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryBankTransfer other = (SalaryBankTransfer) obj;
		return Objects.equals(accountNo, other.accountNo) && Objects.equals(bankCode, other.bankCode)
				&& empCode == other.empCode && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(netSalary) == Double.doubleToLongBits(other.netSalary);
	}
	@Override
	public String toString() {
		return "SalaryBankTransfer [empCode=" + empCode + ", empName=" + empName + ", bankCode=" + bankCode
				+ ", accountNo=" + accountNo + ", netSalary=" + netSalary + "]";
	}
	
	

	

}
