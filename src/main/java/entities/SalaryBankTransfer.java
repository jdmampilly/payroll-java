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
	@Column(name="ac_no")
	private String b_accountNo;
//	@Column(name="emp_code")
//	private int empCode;
	@Column(name="EMP_NAME")
	private String c_nameOfStaff;
	@Column(name="bank_code")
	private String a_bankCode;

	@Column(name="net_salary")
	private double d_netSalary;
	@Column(name="company_bank_code")
	private String zcompanyBankCode;
	public String getB_accountNo() {
		return b_accountNo;
	}
	public void setB_accountNo(String b_accountNo) {
		this.b_accountNo = b_accountNo;
	}
	public String getC_nameOfStaff() {
		return c_nameOfStaff;
	}
	public void setC_nameOfStaff(String c_nameOfStaff) {
		this.c_nameOfStaff = c_nameOfStaff;
	}
	public String getA_bankCode() {
		return a_bankCode;
	}
	public void setA_bankCode(String a_bankCode) {
		this.a_bankCode = a_bankCode;
	}
	public double getD_netSalary() {
		return d_netSalary;
	}
	public void setD_netSalary(double d_netSalary) {
		this.d_netSalary = d_netSalary;
	}
	public String getZcompanyBankCode() {
		return zcompanyBankCode;
	}
	public void setZcompanyBankCode(String zcompanyBankCode) {
		this.zcompanyBankCode = zcompanyBankCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a_bankCode, b_accountNo, c_nameOfStaff, d_netSalary, zcompanyBankCode);
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
		return Objects.equals(a_bankCode, other.a_bankCode) && Objects.equals(b_accountNo, other.b_accountNo)
				&& Objects.equals(c_nameOfStaff, other.c_nameOfStaff)
				&& Double.doubleToLongBits(d_netSalary) == Double.doubleToLongBits(other.d_netSalary)
				&& Objects.equals(zcompanyBankCode, other.zcompanyBankCode);
	}
	@Override
	public String toString() {
		return "SalaryBankTransfer [b_accountNo=" + b_accountNo + ", c_nameOfStaff=" + c_nameOfStaff + ", a_bankCode="
				+ a_bankCode + ", d_netSalary=" + d_netSalary + ", zcompanyBankCode=" + zcompanyBankCode + "]";
	}
	
	
	

	

}
