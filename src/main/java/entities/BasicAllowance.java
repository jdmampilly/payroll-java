package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

public class BasicAllowance implements Serializable {

	private static final long serialVersionUID = -8505898854968886785L;
	
	@Id
	@Column(name="EMP_CODE")
	private int id;
	@Column(name="BASIC_SAL")
	private double basicSalary;
	@Column(name="RENT_ALLOWANCE")
//	private double rentAllowance;
//	@Column(name="SPAGE_ALLOWANCE")
	private double spageAllowance;
	@Column(name="TRAVEL_ALLOWANCE")
	private double travelAllowance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getSpageAllowance() {
		return spageAllowance;
	}
	public void setSpageAllowance(double spageAllowance) {
		this.spageAllowance = spageAllowance;
	}
	public double getTravelAllowance() {
		return travelAllowance;
	}
	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, id, spageAllowance, travelAllowance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicAllowance other = (BasicAllowance) obj;
		return Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary) && id == other.id
				&& Double.doubleToLongBits(spageAllowance) == Double.doubleToLongBits(other.spageAllowance)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance);
	}
	@Override
	public String toString() {
		return "BasicAllowance [id=" + id + ", basicSalary=" + basicSalary + ", spageAllowance=" + spageAllowance
				+ ", travelAllowance=" + travelAllowance + "]";
	}
	
	

}
