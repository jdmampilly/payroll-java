package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMP_LEAVE")
@Cacheable(false)
public class LeaveTransaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "EMP_CODE")
	private int empCode;
	@Column(name = "LV_TYPE")
	private String leaveType;
	@Column(name = "LV_NATURE")
	private String leaveNature;
	@Temporal(TemporalType.DATE)
	@Column(name = "LV_DATE_FROM")
	private Date dateFrom;
	@Temporal(TemporalType.DATE)
	@Column(name = "LV_DATE_TO")
	private Date dateTo;
	@Column(name = "LV_APPROVED")
	private int approvalStatus;
	@Column(name = "LV_REMARKS")
	private String remarks;
	@Temporal(TemporalType.DATE)
	@Column(name = "LV_APPL_DATE")
	private Date applicationDate;
	@Column(name = "NO_OF_WORKDAYS")
	private double noOfWorkingdays;
	@Column(name = "ADJ_LV")
	private double adjLeave;
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
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveNature() {
		return leaveNature;
	}
	public void setLeaveNature(String leaveNature) {
		this.leaveNature = leaveNature;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	@Override
	public int hashCode() {
		return Objects.hash(adjLeave, applicationDate, approvalStatus, dateFrom, dateTo, empCode, id, leaveNature,
				leaveType, noOfWorkingdays, remarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		LeaveTransaction other = (LeaveTransaction) obj;
		return Double.doubleToLongBits(adjLeave) == Double.doubleToLongBits(other.adjLeave)
				&& Objects.equals(applicationDate, other.applicationDate) && approvalStatus == other.approvalStatus
				&& Objects.equals(dateFrom, other.dateFrom) && Objects.equals(dateTo, other.dateTo)
				&& empCode == other.empCode && id == other.id && Objects.equals(leaveNature, other.leaveNature)
				&& Objects.equals(leaveType, other.leaveType)
				&& Double.doubleToLongBits(noOfWorkingdays) == Double.doubleToLongBits(other.noOfWorkingdays)
				&& Objects.equals(remarks, other.remarks);
	}
	@Override
	public String toString() {
		return "LeaveTransaction [id=" + id + ", empCode=" + empCode + ", leaveType=" + leaveType + ", leaveNature="
				+ leaveNature + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", approvalStatus=" + approvalStatus
				+ ", remarks=" + remarks + ", applicationDate=" + applicationDate + ", noOfWorkingdays="
				+ noOfWorkingdays + ", adjLeave=" + adjLeave + "]";
	}




}
