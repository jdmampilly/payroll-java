package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Month")
public class Month implements Serializable{

	private static final long serialVersionUID = -1903990596373342264L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="MONTH")
	private int month;
	@Column(name="YEAR")
	private int year;
	@Column(name="MONTH_NAME")
	private String monthName;
	@Column(name="DAYS")
	private int days;
	@Column(name="STATUS")
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + id;
		result = prime * result + month;
		result = prime * result + ((monthName == null) ? 0 : monthName.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Month other = (Month) obj;
		if (days != other.days)
			return false;
		if (id != other.id)
			return false;
		if (month != other.month)
			return false;
		if (monthName == null) {
			if (other.monthName != null)
				return false;
		} else if (!monthName.equals(other.monthName))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (year != other.year)
			return false;
		return true;
	}





}
