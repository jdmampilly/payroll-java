package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMP_LN_SUMM_VU1")
public class EmployeeLoanSummaryView implements Serializable {

	private static final long serialVersionUID = 6184724137114311791L;
	@Id
	@Column(name="emp_code")
	private int empCode;
	@Column(name="total_dr")
	private double drAmount;
	@Column(name="total_cr")
	private double crAmount;
	@Temporal(TemporalType.DATE)
	@Column(name="last_trn_date")
	private Date lastTransactionDate;
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
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
	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}
	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(crAmount, drAmount, empCode, lastTransactionDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeLoanSummaryView other = (EmployeeLoanSummaryView) obj;
		return Double.doubleToLongBits(crAmount) == Double.doubleToLongBits(other.crAmount)
				&& Double.doubleToLongBits(drAmount) == Double.doubleToLongBits(other.drAmount)
				&& empCode == other.empCode && Objects.equals(lastTransactionDate, other.lastTransactionDate);
	}
	@Override
	public String toString() {
		return "EmployeeLoanSummaryView [empCode=" + empCode + ", drAmount=" + drAmount + ", crAmount=" + crAmount
				+ ", lastTransactionDate=" + lastTransactionDate + "]";
	}
	
	

}
