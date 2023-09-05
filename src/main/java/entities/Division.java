package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Division")
public class Division implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5169579951150852889L;
	@Id
	@Column(name = "DIVISION_CODE")
	private String id;
	@Column(name = "DIVISION_NAME")
	private String divisionName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(divisionName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Division other = (Division) obj;
		return Objects.equals(divisionName, other.divisionName) && Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Division [id=" + id + ", divisionName=" + divisionName + "]";
	}
	
	
}
