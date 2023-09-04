package dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

public class EmpBasicAllowances implements Serializable {
	private static final long serialVersionUID = -8321354463464211166L;


	@Id
	@Column(name="EMP_CODE")
	private int id;
	private double basicSalary;
	private double rentAllowance;
//	private double spageAllowance;
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
	public double getRentAllowance() {
		return rentAllowance;
	}
	public void setRentAllowance(double rentAllowance) {
		this.rentAllowance = rentAllowance;
	}
	public double getTravelAllowance() {
		return travelAllowance;
	}
	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(basicSalary, id, rentAllowance, travelAllowance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpBasicAllowances other = (EmpBasicAllowances) obj;
		return Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary) && id == other.id
				&& Double.doubleToLongBits(rentAllowance) == Double.doubleToLongBits(other.rentAllowance)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance);
	}
	@Override
	public String toString() {
		return "EmpBasicAllowances [id=" + id + ", basicSalary=" + basicSalary + ", rentAllowance=" + rentAllowance
				+ ", travelAllowance=" + travelAllowance + "]";
	}

}
