package dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class EmpLoanSummaryListDto implements Serializable {
	
	
	private static final long serialVersionUID = -6818637243393560584L;
	@Id
	@Column(name="emp_code")
	private int id;
	@Column(name="emp_name")
	private String empName;
	@Temporal(TemporalType.DATE)
	@Column(name="trn_date")
	private Date lastTransactionDate;
	@Column(name="total_dr")
	private BigDecimal totalPayment;
	@Column(name="total_cr")
	private BigDecimal totalLoans;
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
	public BigDecimal getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(BigDecimal totalPayment) {
		this.totalPayment = totalPayment;
	}
	public BigDecimal getTotalLoans() {
		return totalLoans;
	}
	public void setTotalLoans(BigDecimal totalLoans) {
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpLoanSummaryListDto other = (EmpLoanSummaryListDto) obj;
		return Objects.equals(empName, other.empName) && id == other.id
				&& Objects.equals(lastTransactionDate, other.lastTransactionDate)
				&& Objects.equals(totalLoans, other.totalLoans) && Objects.equals(totalPayment, other.totalPayment);
	}
	
	
	

}
