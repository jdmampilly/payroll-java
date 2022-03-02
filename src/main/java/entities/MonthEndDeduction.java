package entities;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MET_DEDUCTIONS")
public class MonthEndDeduction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Column(name="TRN_ID")
	private int trnId;
	@Column(name="TRNS_MONTH")
	private int trnMonth;
	@Column(name="TRN_YEAR")
	private int trnYear;
	@Column(name="OTHER_DEDUCTIONS")
	private double otherDeduction;
	@Column(name="DESCR")
	private String description;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + empCode;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(otherDeduction);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + trnId;
		result = prime * result + trnMonth;
		result = prime * result + trnYear;
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
		MonthEndDeduction other = (MonthEndDeduction) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (empCode != other.empCode)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(otherDeduction) != Double.doubleToLongBits(other.otherDeduction))
			return false;
		if (trnId != other.trnId)
			return false;
		if (trnMonth != other.trnMonth)
			return false;
		if (trnYear != other.trnYear)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MonthEndDeduction [id=" + id + ", empCode=" + empCode + ", trnId=" + trnId + ", trnMonth=" + trnMonth
				+ ", trnYear=" + trnYear + ", otherDeduction=" + otherDeduction + ", description=" + description + "]";
	}
	
	
}
