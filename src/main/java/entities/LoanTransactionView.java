package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="vwLoanTransactions")
public class LoanTransactionView implements Serializable {

	private static final long serialVersionUID = 237483716382648785L;
	@Id
	@Column(name="id")
	private int id;
	@Column(name="empCode")
	private int empCode;
	@Column(name="empName")
	private String empName;
	@Column(name="trnId")
	private int trnId;
	@Temporal(TemporalType.DATE)
	@Column(name="trnDate")
	private Date trnDate;
	@Column(name="drAmount")
	private double drAmount;
	@Column(name="crAmount")
	private double crAmount;
	@Column(name="trnDescription")
	private String trnDescription;
	@Column(name="bankCode")
	private String bankCode;
	@Column(name="voucherNo")
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
	public int getTrnId() {
		return trnId;
	}
	public void setTrnId(int trnId) {
		this.trnId = trnId;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		long temp;
		temp = Double.doubleToLongBits(crAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(drAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empCode;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + id;
		result = prime * result + ((trnDate == null) ? 0 : trnDate.hashCode());
		result = prime * result + ((trnDescription == null) ? 0 : trnDescription.hashCode());
		result = prime * result + trnId;
		result = prime * result + ((voucherNo == null) ? 0 : voucherNo.hashCode());
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
		LoanTransactionView other = (LoanTransactionView) obj;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (Double.doubleToLongBits(crAmount) != Double.doubleToLongBits(other.crAmount))
			return false;
		if (Double.doubleToLongBits(drAmount) != Double.doubleToLongBits(other.drAmount))
			return false;
		if (empCode != other.empCode)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		if (trnDate == null) {
			if (other.trnDate != null)
				return false;
		} else if (!trnDate.equals(other.trnDate))
			return false;
		if (trnDescription == null) {
			if (other.trnDescription != null)
				return false;
		} else if (!trnDescription.equals(other.trnDescription))
			return false;
		if (trnId != other.trnId)
			return false;
		if (voucherNo == null) {
			if (other.voucherNo != null)
				return false;
		} else if (!voucherNo.equals(other.voucherNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoanTransactionView [id=" + id + ", empCode=" + empCode + ", empName=" + empName + ", trnId=" + trnId
				+ ", trnDate=" + trnDate + ", drAmount=" + drAmount + ", crAmount=" + crAmount + ", trnDescription="
				+ trnDescription + ", bankCode=" + bankCode + ", voucherNo=" + voucherNo + "]";
	}

	
	
}
