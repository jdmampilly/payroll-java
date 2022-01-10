package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LeaveMaster")
public class LeaveMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name="empCode")
	private int empCode;
	@Column(name="annualLeave")
	private double annualLeave;
	@Column(name="sickLeave")
	private double sickLeave;
	@Column(name="casualLeave")
	private double casualLeave;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualLeave);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(casualLeave);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empCode;
		result = prime * result + id;
		temp = Double.doubleToLongBits(sickLeave);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		LeaveMaster other = (LeaveMaster) obj;
		if (Double.doubleToLongBits(annualLeave) != Double.doubleToLongBits(other.annualLeave))
			return false;
		if (Double.doubleToLongBits(casualLeave) != Double.doubleToLongBits(other.casualLeave))
			return false;
		if (empCode != other.empCode)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(sickLeave) != Double.doubleToLongBits(other.sickLeave))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LeaveMaster [id=" + id + ", empCode=" + empCode + ", annualLeave=" + annualLeave + ", sickLeave="
				+ sickLeave + ", casualLeave=" + casualLeave + "]";
	}
	

}
