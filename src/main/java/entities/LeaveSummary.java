package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_LEAVE_SUMMARY")
public class LeaveSummary implements Serializable {

	private static final long serialVersionUID = 1241853321795970645L;
	@Id
	@Column(name="EMP_CODE")
	private int id;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="annualLeave")
	private double annualLeave;
	@Column(name="sickLeave")
	private double sickLeave;
	@Column(name="otherLeave")
	private double casualLeave;
	@Column(name="leaveAdjusted")
	private double leaveAdjusted;
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
	public double getLeaveAdjusted() {
		return leaveAdjusted;
	}
	public void setLeaveAdjusted(double leaveAdjusted) {
		this.leaveAdjusted = leaveAdjusted;
	}
	@Override
	public int hashCode() {
		return Objects.hash(annualLeave, casualLeave, empName, id, leaveAdjusted, sickLeave);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LeaveSummary other = (LeaveSummary) obj;
		return Double.doubleToLongBits(annualLeave) == Double.doubleToLongBits(other.annualLeave)
				&& Double.doubleToLongBits(casualLeave) == Double.doubleToLongBits(other.casualLeave)
				&& Objects.equals(empName, other.empName) && id == other.id
				&& Double.doubleToLongBits(leaveAdjusted) == Double.doubleToLongBits(other.leaveAdjusted)
				&& Double.doubleToLongBits(sickLeave) == Double.doubleToLongBits(other.sickLeave);
	}
	@Override
	public String toString() {
		return "LeaveSummary [id=" + id + ", empName=" + empName + ", annualLeave=" + annualLeave + ", sickLeave="
				+ sickLeave + ", casualLeave=" + casualLeave + ", leaveAdjusted=" + leaveAdjusted + "]";
	}




}
