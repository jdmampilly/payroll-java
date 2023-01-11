package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MET_ALLOWANCE")
@Cacheable(false)
public class MonthEndAllowance implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TRN_ID")
	private int trnId;
	@Column(name="EMP_CODE")
	private int id;
	@Column(name="TRN_MONTH")
	private int trnMonth;
	@Column(name="TRN_YEAR")
	private int trnYear;
	@Column(name="OTHER_ALLOWANCE")
	private double otherAllowance;
	@Column(name="DESCR")
	private String description;
	public int getTrnId() {
		return trnId;
	}
	public void setTrnId(int trnId) {
		this.trnId = trnId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrnMonth() {
		return trnMonth;
	}
	public void setTrnMonth(int trnMonth) {
		this.trnMonth = trnMonth;
	}
	public int getTrnYear() {
		return trnYear;
	}
	public void setTrnYear(int trnYear) {
		this.trnYear = trnYear;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id, otherAllowance, trnId, trnMonth, trnYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		MonthEndAllowance other = (MonthEndAllowance) obj;
		return Objects.equals(description, other.description) && id == other.id
				&& Double.doubleToLongBits(otherAllowance) == Double.doubleToLongBits(other.otherAllowance)
				&& trnId == other.trnId && trnMonth == other.trnMonth && trnYear == other.trnYear;
	}
	@Override
	public String toString() {
		return "MonthEndAllowance [trnId=" + trnId + ", id=" + id + ", trnMonth=" + trnMonth + ", trnYear=" + trnYear
				+ ", otherAllowance=" + otherAllowance + ", description=" + description + "]";
	}



}
