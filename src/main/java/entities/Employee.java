package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="EMP_MAST")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EMP_CODE")
	private int id;
	@Column(name="EMP_NAME")
	private String empName;
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Column(name="NATIONALITY")
	private String nationality;
	@Column(name="PASSPORT_NO")
	private String passportNo;
	@Temporal(TemporalType.DATE)
	@Column(name="PASSPORT_DT_ISSUE")
	private Date passportIssuedDate;
	@Temporal(TemporalType.DATE)
	@Column(name="PASSPORT_DT_EXP")
	private Date passportExpiryDate;
	@Column(name="CPR_NO")
	private String cprNo;
	@Temporal(TemporalType.DATE)
	@Column(name="CPR_DT_ISSUE")
	private Date cprIssuedDate;
	@Temporal(TemporalType.DATE)
	@Column(name="CPR_DT_EXP")
	private Date cprExpiryDate;
	@Column(name="GOSI_NO")
	private String gosiNo;
	@Temporal(TemporalType.DATE)
	@Column(name="GOSI_REG_DT")
	private Date gosiRegistrationDate;
	@Temporal(TemporalType.DATE)
	@Column(name="EMP_DT_JOIN")
	private Date onBoardingDate;
	@Temporal(TemporalType.DATE)
	@Column(name="EMP_DT_LEAVE")
	private Date offBoardingDate;
	@Column(name="PROFFESSION")
	private String profession;
	@Column(name="WORK_DESGN")
	private String workDesignation;
	@Column(name="DEPT_CODE")
	private String deptCode;
	@Column(name="CONTRACT_TYPE")
	private String contractType;
	@Column(name="RES_PERMIT")
	private String residencePermitNo;
	@Temporal(TemporalType.DATE)
	@Column(name="RES_PMT_IS_DT")
	private Date residencePermitIssueDate;
	@Temporal(TemporalType.DATE)
	@Column(name="RE_PMT_EXP_DT")
	private Date residencePermitExpiryDate;
	@Column(name="PASSAGE")
	private String passage;
	@Column(name="TICKET")
	private String ticket;
	@Column(name="BASIC_SALARY")
	private double basicSalary;
	@Column(name="BANK_CODE")
	private String bankCode;
	@Column(name="AC_NO")
	private String acNumber;
	@Column(name="PYMT_MODE")
	private String paymentMode;
	@Column(name="RENT_ALLOWANCE")
	private double rentAllowance;
	@Column(name="TRAVEL_ALLOWANCE")
	private double travelAllowance;
	@Column(name="SPL_ALLOWANCE")
	private double specialAllowance;
	@Column(name="GOSI_AMT")
	private double gosiAmount;
	@Column(name="HSE_BANK_AMT")
	private double housingBankAmount;
	@Column(name="TEL_GRNT")
	private String telephoneGuarantee;
	@Column(name="ELEC_GRNT")
	private String electricityGuarantee;
	@Column(name="EXT_BANK_LOAN_GRNT")
	private String externalBankLoanGuarantee;
	@Column(name="EMP_BANK_NAME")
	private String bankName;
	@Column(name="OTH_ALLOWANCE")
	private double otherAllowance;
	@Column(name="NSH_ALLOWANCE")
	private double nshAllowance;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String getPassportNo() {
		return passportNo;
	}



	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}



	public Date getPassportIssuedDate() {
		return passportIssuedDate;
	}



	public void setPassportIssuedDate(Date passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}



	public Date getPassportExpiryDate() {
		return passportExpiryDate;
	}



	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}



	public String getCprNo() {
		return cprNo;
	}



	public void setCprNo(String cprNo) {
		this.cprNo = cprNo;
	}



	public Date getCprIssuedDate() {
		return cprIssuedDate;
	}



	public void setCprIssuedDate(Date cprIssuedDate) {
		this.cprIssuedDate = cprIssuedDate;
	}



	public Date getCprExpiryDate() {
		return cprExpiryDate;
	}



	public void setCprExpiryDate(Date cprExpiryDate) {
		this.cprExpiryDate = cprExpiryDate;
	}



	public String getGosiNo() {
		return gosiNo;
	}



	public void setGosiNo(String gosiNo) {
		this.gosiNo = gosiNo;
	}



	public Date getGosiRegistrationDate() {
		return gosiRegistrationDate;
	}



	public void setGosiRegistrationDate(Date gosiRegistrationDate) {
		this.gosiRegistrationDate = gosiRegistrationDate;
	}



	public Date getOnBoardingDate() {
		return onBoardingDate;
	}



	public void setOnBoardingDate(Date onBoardingDate) {
		this.onBoardingDate = onBoardingDate;
	}



	public Date getOffBoardingDate() {
		return offBoardingDate;
	}



	public void setOffBoardingDate(Date offBoardingDate) {
		this.offBoardingDate = offBoardingDate;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	public String getWorkDesignation() {
		return workDesignation;
	}



	public void setWorkDesignation(String workDesignation) {
		this.workDesignation = workDesignation;
	}



	public String getDeptCode() {
		return deptCode;
	}



	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}



	public String getContractType() {
		return contractType;
	}



	public void setContractType(String contractType) {
		this.contractType = contractType;
	}



	public String getResidencePermitNo() {
		return residencePermitNo;
	}



	public void setResidencePermitNo(String residencePermitNo) {
		this.residencePermitNo = residencePermitNo;
	}



	public Date getResidencePermitIssueDate() {
		return residencePermitIssueDate;
	}



	public void setResidencePermitIssueDate(Date residencePermitIssueDate) {
		this.residencePermitIssueDate = residencePermitIssueDate;
	}



	public Date getResidencePermitExpiryDate() {
		return residencePermitExpiryDate;
	}



	public void setResidencePermitExpiryDate(Date residencePermitExpiryDate) {
		this.residencePermitExpiryDate = residencePermitExpiryDate;
	}



	public String getPassage() {
		return passage;
	}



	public void setPassage(String passage) {
		this.passage = passage;
	}



	public String getTicket() {
		return ticket;
	}



	public void setTicket(String ticket) {
		this.ticket = ticket;
	}



	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public String getBankCode() {
		return bankCode;
	}



	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}



	public String getAcNumber() {
		return acNumber;
	}



	public void setAcNumber(String acNumber) {
		this.acNumber = acNumber;
	}



	public String getPaymentMode() {
		return paymentMode;
	}



	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}



	public double getRentAllowance() {
		return rentAllowance;
	}



	public void setRentAllowance(double rentAllowance) {
		this.rentAllowance = rentAllowance;
	}



	public double getTravelAllowance() {
		return travelAllowance;
	}



	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}



	public double getSpecialAllowance() {
		return specialAllowance;
	}



	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}



	public double getGosiAmount() {
		return gosiAmount;
	}



	public void setGosiAmount(double gosiAmount) {
		this.gosiAmount = gosiAmount;
	}



	public double getHousingBankAmount() {
		return housingBankAmount;
	}



	public void setHousingBankAmount(double housingBankAmount) {
		this.housingBankAmount = housingBankAmount;
	}



	public String getTelephoneGuarantee() {
		return telephoneGuarantee;
	}



	public void setTelephoneGuarantee(String telephoneGuarantee) {
		this.telephoneGuarantee = telephoneGuarantee;
	}



	public String getElectricityGuarantee() {
		return electricityGuarantee;
	}



	public void setElectricityGuarantee(String electricityGuarantee) {
		this.electricityGuarantee = electricityGuarantee;
	}



	public String getExternalBankLoanGuarantee() {
		return externalBankLoanGuarantee;
	}



	public void setExternalBankLoanGuarantee(String externalBankLoanGuarantee) {
		this.externalBankLoanGuarantee = externalBankLoanGuarantee;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public double getOtherAllowance() {
		return otherAllowance;
	}



	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}



	public double getNshAllowance() {
		return nshAllowance;
	}



	public void setNshAllowance(double nshAllowance) {
		this.nshAllowance = nshAllowance;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acNumber == null) ? 0 : acNumber.hashCode());
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((contractType == null) ? 0 : contractType.hashCode());
		result = prime * result + ((cprExpiryDate == null) ? 0 : cprExpiryDate.hashCode());
		result = prime * result + ((cprIssuedDate == null) ? 0 : cprIssuedDate.hashCode());
		result = prime * result + ((cprNo == null) ? 0 : cprNo.hashCode());
		result = prime * result + ((deptCode == null) ? 0 : deptCode.hashCode());
		result = prime * result + ((electricityGuarantee == null) ? 0 : electricityGuarantee.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((externalBankLoanGuarantee == null) ? 0 : externalBankLoanGuarantee.hashCode());
		temp = Double.doubleToLongBits(gosiAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((gosiNo == null) ? 0 : gosiNo.hashCode());
		result = prime * result + ((gosiRegistrationDate == null) ? 0 : gosiRegistrationDate.hashCode());
		temp = Double.doubleToLongBits(housingBankAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		temp = Double.doubleToLongBits(nshAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((offBoardingDate == null) ? 0 : offBoardingDate.hashCode());
		result = prime * result + ((onBoardingDate == null) ? 0 : onBoardingDate.hashCode());
		temp = Double.doubleToLongBits(otherAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((passage == null) ? 0 : passage.hashCode());
		result = prime * result + ((passportExpiryDate == null) ? 0 : passportExpiryDate.hashCode());
		result = prime * result + ((passportIssuedDate == null) ? 0 : passportIssuedDate.hashCode());
		result = prime * result + ((passportNo == null) ? 0 : passportNo.hashCode());
		result = prime * result + ((paymentMode == null) ? 0 : paymentMode.hashCode());
		result = prime * result + ((profession == null) ? 0 : profession.hashCode());
		temp = Double.doubleToLongBits(rentAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((residencePermitExpiryDate == null) ? 0 : residencePermitExpiryDate.hashCode());
		result = prime * result + ((residencePermitIssueDate == null) ? 0 : residencePermitIssueDate.hashCode());
		result = prime * result + ((residencePermitNo == null) ? 0 : residencePermitNo.hashCode());
		temp = Double.doubleToLongBits(specialAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((telephoneGuarantee == null) ? 0 : telephoneGuarantee.hashCode());
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
		temp = Double.doubleToLongBits(travelAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((workDesignation == null) ? 0 : workDesignation.hashCode());
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
		Employee other = (Employee) obj;
		if (acNumber == null) {
			if (other.acNumber != null)
				return false;
		} else if (!acNumber.equals(other.acNumber))
			return false;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (contractType == null) {
			if (other.contractType != null)
				return false;
		} else if (!contractType.equals(other.contractType))
			return false;
		if (cprExpiryDate == null) {
			if (other.cprExpiryDate != null)
				return false;
		} else if (!cprExpiryDate.equals(other.cprExpiryDate))
			return false;
		if (cprIssuedDate == null) {
			if (other.cprIssuedDate != null)
				return false;
		} else if (!cprIssuedDate.equals(other.cprIssuedDate))
			return false;
		if (cprNo == null) {
			if (other.cprNo != null)
				return false;
		} else if (!cprNo.equals(other.cprNo))
			return false;
		if (deptCode == null) {
			if (other.deptCode != null)
				return false;
		} else if (!deptCode.equals(other.deptCode))
			return false;
		if (electricityGuarantee == null) {
			if (other.electricityGuarantee != null)
				return false;
		} else if (!electricityGuarantee.equals(other.electricityGuarantee))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (externalBankLoanGuarantee == null) {
			if (other.externalBankLoanGuarantee != null)
				return false;
		} else if (!externalBankLoanGuarantee.equals(other.externalBankLoanGuarantee))
			return false;
		if (Double.doubleToLongBits(gosiAmount) != Double.doubleToLongBits(other.gosiAmount))
			return false;
		if (gosiNo == null) {
			if (other.gosiNo != null)
				return false;
		} else if (!gosiNo.equals(other.gosiNo))
			return false;
		if (gosiRegistrationDate == null) {
			if (other.gosiRegistrationDate != null)
				return false;
		} else if (!gosiRegistrationDate.equals(other.gosiRegistrationDate))
			return false;
		if (Double.doubleToLongBits(housingBankAmount) != Double.doubleToLongBits(other.housingBankAmount))
			return false;
		if (id != other.id)
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (Double.doubleToLongBits(nshAllowance) != Double.doubleToLongBits(other.nshAllowance))
			return false;
		if (offBoardingDate == null) {
			if (other.offBoardingDate != null)
				return false;
		} else if (!offBoardingDate.equals(other.offBoardingDate))
			return false;
		if (onBoardingDate == null) {
			if (other.onBoardingDate != null)
				return false;
		} else if (!onBoardingDate.equals(other.onBoardingDate))
			return false;
		if (Double.doubleToLongBits(otherAllowance) != Double.doubleToLongBits(other.otherAllowance))
			return false;
		if (passage == null) {
			if (other.passage != null)
				return false;
		} else if (!passage.equals(other.passage))
			return false;
		if (passportExpiryDate == null) {
			if (other.passportExpiryDate != null)
				return false;
		} else if (!passportExpiryDate.equals(other.passportExpiryDate))
			return false;
		if (passportIssuedDate == null) {
			if (other.passportIssuedDate != null)
				return false;
		} else if (!passportIssuedDate.equals(other.passportIssuedDate))
			return false;
		if (passportNo == null) {
			if (other.passportNo != null)
				return false;
		} else if (!passportNo.equals(other.passportNo))
			return false;
		if (paymentMode == null) {
			if (other.paymentMode != null)
				return false;
		} else if (!paymentMode.equals(other.paymentMode))
			return false;
		if (profession == null) {
			if (other.profession != null)
				return false;
		} else if (!profession.equals(other.profession))
			return false;
		if (Double.doubleToLongBits(rentAllowance) != Double.doubleToLongBits(other.rentAllowance))
			return false;
		if (residencePermitExpiryDate == null) {
			if (other.residencePermitExpiryDate != null)
				return false;
		} else if (!residencePermitExpiryDate.equals(other.residencePermitExpiryDate))
			return false;
		if (residencePermitIssueDate == null) {
			if (other.residencePermitIssueDate != null)
				return false;
		} else if (!residencePermitIssueDate.equals(other.residencePermitIssueDate))
			return false;
		if (residencePermitNo == null) {
			if (other.residencePermitNo != null)
				return false;
		} else if (!residencePermitNo.equals(other.residencePermitNo))
			return false;
		if (Double.doubleToLongBits(specialAllowance) != Double.doubleToLongBits(other.specialAllowance))
			return false;
		if (telephoneGuarantee == null) {
			if (other.telephoneGuarantee != null)
				return false;
		} else if (!telephoneGuarantee.equals(other.telephoneGuarantee))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		if (Double.doubleToLongBits(travelAllowance) != Double.doubleToLongBits(other.travelAllowance))
			return false;
		if (workDesignation == null) {
			if (other.workDesignation != null)
				return false;
		} else if (!workDesignation.equals(other.workDesignation))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [ id=" + id + ", empName=" + empName + "]";
	}
	

}
