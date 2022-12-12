package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="VW_EMP_LEAVE_HISTORY")
public class LeaveTransactionView implements Serializable {
	private static final long serialVersionUID = 2596386538572126223L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="EMP_CODE")
	private int empCode;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="LV_TYPE")
	private String lvType;
	@Column(name="LV_NATURE")
	private String lvNature;
	@Temporal(TemporalType.DATE)
	@Column(name="LV_DATE_FROM")
	private Date dateFrom;
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
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLvType() {
		return lvType;
	}
	public void setLvType(String lvType) {
		this.lvType = lvType;
	}
	public String getLvNature() {
		return lvNature;
	}
	public void setLvNature(String lvNature) {
		this.lvNature = lvNature;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public int getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public double getNoOfWorkingdays() {
		return noOfWorkingdays;
	}
	public void setNoOfWorkingdays(double noOfWorkingdays) {
		this.noOfWorkingdays = noOfWorkingdays;
	}
	public double getAdjLeave() {
		return adjLeave;
	}
	public void setAdjLeave(double adjLeave) {
		this.adjLeave = adjLeave;
	}
	@Temporal(TemporalType.DATE)
	@Column(name="LV_DATE_TO")
	private Date dateTo;
	@Column(name="LV_APPROVED")
	private int approvalStatus;
	@Temporal(TemporalType.DATE)
	@Column(name="LV_APPL_DATE")
	private Date applicationDate;
	@Column(name="NO_OF_WORKDAYS")
	private double noOfWorkingdays;
	@Column(name="ADJ_LV")
	private double adjLeave;
	@Override
	public int hashCode() {
		return Objects.hash(adjLeave, applicationDate, approvalStatus, dateFrom, dateTo, empCode, empName, id, lvNature,
				lvType, noOfWorkingdays);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LeaveTransactionView other = (LeaveTransactionView) obj;
		return Double.doubleToLongBits(adjLeave) == Double.doubleToLongBits(other.adjLeave)
				&& Objects.equals(applicationDate, other.applicationDate) && approvalStatus == other.approvalStatus
				&& Objects.equals(dateFrom, other.dateFrom) && Objects.equals(dateTo, other.dateTo)
				&& empCode == other.empCode && Objects.equals(empName, other.empName) && id == other.id
				&& Objects.equals(lvNature, other.lvNature) && Objects.equals(lvType, other.lvType)
				&& Double.doubleToLongBits(noOfWorkingdays) == Double.doubleToLongBits(other.noOfWorkingdays);
	}
	@Override
	public String toString() {
		return "LeaveTransactionView [id=" + id + ", empCode=" + empCode + ", empName=" + empName + ", lvType=" + lvType
				+ ", lvNature=" + lvNature + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", approvalStatus="
				+ approvalStatus + ", applicationDate=" + applicationDate + ", noOfWorkingdays=" + noOfWorkingdays
				+ ", adjLeave=" + adjLeave + "]";
	}


}
