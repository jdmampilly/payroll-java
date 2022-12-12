package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LV_MAST")
public class LeaveMaster implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Column(name="TRN_ID")
	private int trnId;
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
	public int getTrnId() {
		return trnId;
	}
	public void setTrnId(int trnId) {
		this.trnId = trnId;
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
		return Objects.hash(adjLeave, annualLeave, casualLeave, empCode, id, sickLeave, trnId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LeaveMaster other = (LeaveMaster) obj;
		return Double.doubleToLongBits(adjLeave) == Double.doubleToLongBits(other.adjLeave)
				&& Double.doubleToLongBits(annualLeave) == Double.doubleToLongBits(other.annualLeave)
				&& Double.doubleToLongBits(casualLeave) == Double.doubleToLongBits(other.casualLeave)
				&& empCode == other.empCode && id == other.id
				&& Double.doubleToLongBits(sickLeave) == Double.doubleToLongBits(other.sickLeave)
				&& trnId == other.trnId;
	}
	@Override
	public String toString() {
		return "LeaveMaster [id=" + id + ", empCode=" + empCode + ", trnId=" + trnId + ", annualLeave=" + annualLeave
				+ ", sickLeave=" + sickLeave + ", casualLeave=" + casualLeave + ", adjLeave=" + adjLeave + "]";
	}



}
