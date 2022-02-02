package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMP_LN_SUMM_VU1")
public class EmployeeLoanSummaryView implements Serializable {

	private static final long serialVersionUID = 4139567230683771811L;
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
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(crAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(drAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empCode;
		result = prime * result + ((lastTransactionDate == null) ? 0 : lastTransactionDate.hashCode());
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
		EmployeeLoanSummaryView other = (EmployeeLoanSummaryView) obj;
		if (Double.doubleToLongBits(crAmount) != Double.doubleToLongBits(other.crAmount))
			return false;
		if (Double.doubleToLongBits(drAmount) != Double.doubleToLongBits(other.drAmount))
			return false;
		if (empCode != other.empCode)
			return false;
		if (lastTransactionDate == null) {
			if (other.lastTransactionDate != null)
				return false;
		} else if (!lastTransactionDate.equals(other.lastTransactionDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployeeLoanSummaryView [empCode=" + empCode + ", drAmount=" + drAmount + ", crAmount=" + crAmount
				+ ", lastTransactionDate=" + lastTransactionDate + "]";
	}
	
	

}
