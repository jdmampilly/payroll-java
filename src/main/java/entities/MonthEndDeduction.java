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
@Table(name="MET_DEDUCTION")
@Cacheable(false)
public class MonthEndDeduction implements Serializable{

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
	@Column(name="OTHER_DEDUCTION")
	private double otherDeduction;
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
	public double getOtherDeduction() {
		return otherDeduction;
	}
	public void setOtherDeduction(double otherDeduction) {
		this.otherDeduction = otherDeduction;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id, otherDeduction, trnId, trnMonth, trnYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		MonthEndDeduction other = (MonthEndDeduction) obj;
		return Objects.equals(description, other.description) && id == other.id
				&& Double.doubleToLongBits(otherDeduction) == Double.doubleToLongBits(other.otherDeduction)
				&& trnId == other.trnId && trnMonth == other.trnMonth && trnYear == other.trnYear;
	}
	@Override
	public String toString() {
		return "MonthEndDeduction [trnId=" + trnId + ", id=" + id + ", trnMonth=" + trnMonth + ", trnYear=" + trnYear
				+ ", otherDeduction=" + otherDeduction + ", description=" + description + "]";
	}



}
