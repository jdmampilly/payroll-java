package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CURRENT_YEAR")
public class CurrentYear implements Serializable {

	private static final long serialVersionUID = -2080266219164603054L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
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
	@Override
	public int hashCode() {
		return Objects.hash(endDate, id, startDate);
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
		return Objects.equals(endDate, other.endDate) && id == other.id && Objects.equals(startDate, other.startDate);
	}
	@Override
	public String toString() {
		return "CurrentYear [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
