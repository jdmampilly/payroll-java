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
@Table(name="LV_TRANS_HIST")
public class LeaveTransactionHistory implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = -3173438766493145012L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Temporal(TemporalType.DATE)
	@Column(name="LV_DATE_FROM")
	private Date dateFrom;
	@Temporal(TemporalType.DATE)
	@Column(name="LV_DATE_TO")
	private Date dateTo;
	@Column(name="ANNUAL_LV")
	private double annualLeave;
	@Column(name="SICK_LV")
	private double sickLeave;
	@Column(name="OTHER_LV")
	private double casualLeave;
	@Column(name="ADJ_LV")
	private double adjLeave;
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
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public double getAnnualLeave() {
		return annualLeave;
	}
	public void setAnnualLeave(double annualLeave) {
		this.annualLeave = annualLeave;
	}
	public double getSickLeave() {
		return sickLeave;
	}
	public void setSickLeave(double sickLeave) {
		this.sickLeave = sickLeave;
	}
	public double getCasualLeave() {
		return casualLeave;
	}
	public void setCasualLeave(double casualLeave) {
		this.casualLeave = casualLeave;
	}
	public double getAdjLeave() {
		return adjLeave;
	}
	public void setAdjLeave(double adjLeave) {
		this.adjLeave = adjLeave;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adjLeave, annualLeave, casualLeave, dateFrom, dateTo, empCode, id, sickLeave);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LeaveTransactionHistory other = (LeaveTransactionHistory) obj;
		return Double.doubleToLongBits(adjLeave) == Double.doubleToLongBits(other.adjLeave)
				&& Double.doubleToLongBits(annualLeave) == Double.doubleToLongBits(other.annualLeave)
				&& Double.doubleToLongBits(casualLeave) == Double.doubleToLongBits(other.casualLeave)
				&& Objects.equals(dateFrom, other.dateFrom) && Objects.equals(dateTo, other.dateTo)
				&& empCode == other.empCode && id == other.id
				&& Double.doubleToLongBits(sickLeave) == Double.doubleToLongBits(other.sickLeave);
	}
	@Override
	public String toString() {
		return "LeaveTransactionHistory [id=" + id + ", empCode=" + empCode + ", dateFrom=" + dateFrom + ", dateTo="
				+ dateTo + ", annualLeave=" + annualLeave + ", sickLeave=" + sickLeave + ", casualLeave=" + casualLeave
				+ ", adjLeave=" + adjLeave + "]";
	}


}
