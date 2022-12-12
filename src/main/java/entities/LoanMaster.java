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
@Table(name="LOAN_MAST")
public class LoanMaster implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Column(name="LOAN_AMT")
	private double loanAmount;
	@Column(name="LOAN_TYPE")
	private char loanType;
	@Column(name="LOAN_INST")
	private double loanInstallment;
	@Temporal(TemporalType.DATE)
	@Column(name="LOAN_DATE")
	private Date loanDate;
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
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public char getLoanType() {
		return loanType;
	}
	public void setLoanType(char loanType) {
		this.loanType = loanType;
	}
	public double getLoanInstallment() {
		return loanInstallment;
	}
	public void setLoanInstallment(double loanInstallment) {
		this.loanInstallment = loanInstallment;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empCode;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(loanAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((loanDate == null) ? 0 : loanDate.hashCode());
		temp = Double.doubleToLongBits(loanInstallment);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + loanType;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LoanMaster other = (LoanMaster) obj;
		if (empCode != other.empCode)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(loanAmount) != Double.doubleToLongBits(other.loanAmount))
			return false;
		if (loanDate == null) {
			if (other.loanDate != null)
				return false;
		} else if (!loanDate.equals(other.loanDate))
			return false;
		if (Double.doubleToLongBits(loanInstallment) != Double.doubleToLongBits(other.loanInstallment))
			return false;
		if (loanType != other.loanType)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoanMaster [id=" + id + ", empCode=" + empCode + ", loanAmount=" + loanAmount + ", loanType=" + loanType
				+ ", loanInstallment=" + loanInstallment + ", loanDate=" + loanDate + "]";
	}






}
