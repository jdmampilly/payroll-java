package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="VW_LOAN_TRANSACTIONS")
@Cacheable(false)
public class LoanTransactionView implements Serializable {

	private static final long serialVersionUID = 237483716382648785L;
	@Id
	@Column(name="TRN_ID")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Column(name="emp_name")
	private String empName;
	@Temporal(TemporalType.DATE)
	@Column(name="TRN_DATE")
	private Date trnDate;
	@Column(name="DR_AMT")
	private double drAmount;
	@Column(name="CR_AMT")
	private double crAmount;
	@Column(name="TRN_DESCR")
	private String trnDescription;
	@Column(name="BANK_CODE")
	private String bankCode;
	@Column(name="VOUCHER_NO")
	private String voucherNo;
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
	public Date getTrnDate() {
		return trnDate;
	}
	public void setTrnDate(Date trnDate) {
		this.trnDate = trnDate;
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
	public String getTrnDescription() {
		return trnDescription;
	}
	public void setTrnDescription(String trnDescription) {
		this.trnDescription = trnDescription;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bankCode, crAmount, drAmount, empCode, empName, id, trnDate, trnDescription, voucherNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LoanTransactionView other = (LoanTransactionView) obj;
		return Objects.equals(bankCode, other.bankCode)
				&& Double.doubleToLongBits(crAmount) == Double.doubleToLongBits(other.crAmount)
				&& Double.doubleToLongBits(drAmount) == Double.doubleToLongBits(other.drAmount)
				&& empCode == other.empCode && Objects.equals(empName, other.empName) && id == other.id
				&& Objects.equals(trnDate, other.trnDate) && Objects.equals(trnDescription, other.trnDescription)
				&& Objects.equals(voucherNo, other.voucherNo);
	}
	@Override
	public String toString() {
		return "LoanTransactionView [id=" + id + ", empCode=" + empCode + ", empName=" + empName + ", trnDate="
				+ trnDate + ", drAmount=" + drAmount + ", crAmount=" + crAmount + ", trnDescription=" + trnDescription
				+ ", bankCode=" + bankCode + ", voucherNo=" + voucherNo + "]";
	}



}