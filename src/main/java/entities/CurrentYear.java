package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AAK_CURRENT_YEAR")
@Cacheable(false)
public class CurrentYear implements Serializable {

	private static final long serialVersionUID = -2080266219164603054L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="StartDate")
	private Date startDate;
	@Column(name="EndDate")
	private Date endDate;
	@Column(name="Yr")
	private int currentYear;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(currentYear, endDate, id, startDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentYear other = (CurrentYear) obj;
		return currentYear == other.currentYear && Objects.equals(endDate, other.endDate) && id == other.id
				&& Objects.equals(startDate, other.startDate);
	}
	@Override
	public String toString() {
		return "CurrentYear [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", currentYear="
				+ currentYear + "]";
	}
	
	
	
}
