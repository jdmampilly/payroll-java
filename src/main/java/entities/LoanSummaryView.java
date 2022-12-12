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
@Table(name="VW_LOAN_SUMMARY")
public class LoanSummaryView implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = -2938941525481992500L;
	@Id
	@Column(name="emp_code")
	private int id;
	@Column(name="emp_name")
	private String empName;
	@Temporal(TemporalType.DATE)
	@Column(name="trn_date")
	private Date lastTransactionDate;
	@Column(name="total_dr")
	private double totalPayment;
	@Column(name="total_cr")
	private double totalLoans;
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
	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}
	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	public double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	public double getTotalLoans() {
		return totalLoans;
	}
	public void setTotalLoans(double totalLoans) {
		this.totalLoans = totalLoans;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empName, id, lastTransactionDate, totalLoans, totalPayment);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LoanSummaryView other = (LoanSummaryView) obj;
		return Objects.equals(empName, other.empName) && id == other.id
				&& Objects.equals(lastTransactionDate, other.lastTransactionDate)
				&& Double.doubleToLongBits(totalLoans) == Double.doubleToLongBits(other.totalLoans)
				&& Double.doubleToLongBits(totalPayment) == Double.doubleToLongBits(other.totalPayment);
	}
	@Override
	public String toString() {
		return "LoanSummaryView [id=" + id + ", empName=" + empName + ", lastTransactionDate=" + lastTransactionDate
				+ ", totalPayment=" + totalPayment + ", totalLoans=" + totalLoans + "]";
	}



}
