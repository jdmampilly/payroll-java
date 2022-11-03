package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dept")
public class Department implements Serializable {
	private static final long serialVersionUID = 5951317614463105953L;
	@Id
	@Column(name = "DEPT_CODE")
	private int id;
	@Column(name = "DEPT_NAME")
	private String departmentName;
	@Column(name = "DIVISION_CODE	")
	private String divisionCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDivisionCode() {
		return divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentName, divisionCode, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentName, other.departmentName) && Objects.equals(divisionCode, other.divisionCode)
				&& id == other.id;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", divisionCode=" + divisionCode + "]";
	}
	
	
	
	

}
