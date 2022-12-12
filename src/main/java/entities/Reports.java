package entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reports")
public class Reports implements Serializable {

	private static final long serialVersionUID = 964807363975295577L;
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id")
	  private int id;
	  @Column(name="report_id")
	  private int reportId;
	  @Column(name="report_name")
	  private String reportName;
	  @Column(name="report_description")
	  private String reportDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getReportDescription() {
		return reportDescription;
	}
	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, reportDescription, reportId, reportName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Reports other = (Reports) obj;
		return id == other.id && Objects.equals(reportDescription, other.reportDescription)
				&& reportId == other.reportId && Objects.equals(reportName, other.reportName);
	}
	@Override
	public String toString() {
		return "Reports [id=" + id + ", reportId=" + reportId + ", reportName=" + reportName + ", reportDescription="
				+ reportDescription + "]";
	}





}
