package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SAL_INCR")
public class SalaryIncrement implements Serializable{
	private static final long serialVersionUID = 2335127898391327927L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TRN_ID")
	private int id;
	@Column(name="Emp_Code")
	private int empCode;
	@Temporal(TemporalType.DATE)
	@Column(name="TRN_DATE")
	private Date transactionDate;
	@Column(name="SAL_INCR")
	private double salIncrement;
	@Column(name="REMARKS")
	private String remarks;
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
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getSalIncrement() {
		return salIncrement;
	}
	public void setSalIncrement(double salIncrement) {
		this.salIncrement = salIncrement;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empCode, id, remarks, salIncrement, transactionDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		SalaryIncrement other = (SalaryIncrement) obj;
		return empCode == other.empCode && id == other.id && Objects.equals(remarks, other.remarks)
				&& Double.doubleToLongBits(salIncrement) == Double.doubleToLongBits(other.salIncrement)
				&& Objects.equals(transactionDate, other.transactionDate);
	}
	@Override
	public String toString() {
		return "SalaryIncrement [id=" + id + ", empCode=" + empCode + ", transactionDate=" + transactionDate
				+ ", salIncrement=" + salIncrement + ", remarks=" + remarks + "]";
	}



}
