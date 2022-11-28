package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_DEPARTMENT")
public class DepartmentView implements Serializable {

	private static final long serialVersionUID = 3551928936730485844L;
	@Id
	@Column(name = "DEPT_CODE")
	private String id;
	@Column(name = "DEPT_NAME")
	private String departmentName;
	@Column(name="DIVISION_NAME")
	private String divisionName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentName, divisionName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentView other = (DepartmentView) obj;
		return Objects.equals(departmentName, other.departmentName) && Objects.equals(divisionName, other.divisionName)
				&& Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "DepartmentView [id=" + id + ", departmentName=" + departmentName + ", divisionName=" + divisionName
				+ "]";
	}
	
	
	
	
}


