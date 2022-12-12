package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="VW_EMPLOYEE")
@Cacheable(false)
public class EmployeeView implements Serializable{
	private static final long serialVersionUID = -3110279090773453054L;
	@Id
	@Column(name="emp_code")
	private int empCode;
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
	@Column(name="LOAN_INST")
	private double loanInstallment;
	@Column(name="division_name")
	private String divisionName;
	@Column(name="dept_name")
	private String deptName;
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
	public double getLoanInstallment() {
		return loanInstallment;
	}
	public void setLoanInstallment(double loanInstallment) {
		this.loanInstallment = loanInstallment;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(acNumber, bankCode, bankName, basicSalary, birthDate, contractType, cprExpiryDate,
				cprIssuedDate, cprNo, deptCode, deptName, divisionName, electricityGuarantee, empCode, empName,
				externalBankLoanGuarantee, gosiAmount, gosiNo, gosiRegistrationDate, housingBankAmount, loanInstallment,
				nationality, nshAllowance, offBoardingDate, onBoardingDate, otherAllowance, passage, passportExpiryDate,
				passportIssuedDate, passportNo, paymentMode, profession, rentAllowance, residencePermitExpiryDate,
				residencePermitIssueDate, residencePermitNo, specialAllowance, telephoneGuarantee, ticket,
				travelAllowance, workDesignation);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		EmployeeView other = (EmployeeView) obj;
		return Objects.equals(acNumber, other.acNumber) && Objects.equals(bankCode, other.bankCode)
				&& Objects.equals(bankName, other.bankName)
				&& Double.doubleToLongBits(basicSalary) == Double.doubleToLongBits(other.basicSalary)
				&& Objects.equals(birthDate, other.birthDate) && Objects.equals(contractType, other.contractType)
				&& Objects.equals(cprExpiryDate, other.cprExpiryDate)
				&& Objects.equals(cprIssuedDate, other.cprIssuedDate) && Objects.equals(cprNo, other.cprNo)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(deptName, other.deptName)
				&& Objects.equals(divisionName, other.divisionName)
				&& Objects.equals(electricityGuarantee, other.electricityGuarantee) && empCode == other.empCode
				&& Objects.equals(empName, other.empName)
				&& Objects.equals(externalBankLoanGuarantee, other.externalBankLoanGuarantee)
				&& Double.doubleToLongBits(gosiAmount) == Double.doubleToLongBits(other.gosiAmount)
				&& Objects.equals(gosiNo, other.gosiNo)
				&& Objects.equals(gosiRegistrationDate, other.gosiRegistrationDate)
				&& Double.doubleToLongBits(housingBankAmount) == Double.doubleToLongBits(other.housingBankAmount)
				&& Double.doubleToLongBits(loanInstallment) == Double.doubleToLongBits(other.loanInstallment)
				&& Objects.equals(nationality, other.nationality)
				&& Double.doubleToLongBits(nshAllowance) == Double.doubleToLongBits(other.nshAllowance)
				&& Objects.equals(offBoardingDate, other.offBoardingDate)
				&& Objects.equals(onBoardingDate, other.onBoardingDate)
				&& Double.doubleToLongBits(otherAllowance) == Double.doubleToLongBits(other.otherAllowance)
				&& Objects.equals(passage, other.passage)
				&& Objects.equals(passportExpiryDate, other.passportExpiryDate)
				&& Objects.equals(passportIssuedDate, other.passportIssuedDate)
				&& Objects.equals(passportNo, other.passportNo) && Objects.equals(paymentMode, other.paymentMode)
				&& Objects.equals(profession, other.profession)
				&& Double.doubleToLongBits(rentAllowance) == Double.doubleToLongBits(other.rentAllowance)
				&& Objects.equals(residencePermitExpiryDate, other.residencePermitExpiryDate)
				&& Objects.equals(residencePermitIssueDate, other.residencePermitIssueDate)
				&& Objects.equals(residencePermitNo, other.residencePermitNo)
				&& Double.doubleToLongBits(specialAllowance) == Double.doubleToLongBits(other.specialAllowance)
				&& Objects.equals(telephoneGuarantee, other.telephoneGuarantee) && Objects.equals(ticket, other.ticket)
				&& Double.doubleToLongBits(travelAllowance) == Double.doubleToLongBits(other.travelAllowance)
				&& Objects.equals(workDesignation, other.workDesignation);
	}
	@Override
	public String toString() {
		return "EmployeeView [empCode=" + empCode + ", empName=" + empName + ", birthDate=" + birthDate
				+ ", nationality=" + nationality + ", passportNo=" + passportNo + ", passportIssuedDate="
				+ passportIssuedDate + ", passportExpiryDate=" + passportExpiryDate + ", cprNo=" + cprNo
				+ ", cprIssuedDate=" + cprIssuedDate + ", cprExpiryDate=" + cprExpiryDate + ", gosiNo=" + gosiNo
				+ ", gosiRegistrationDate=" + gosiRegistrationDate + ", onBoardingDate=" + onBoardingDate
				+ ", offBoardingDate=" + offBoardingDate + ", profession=" + profession + ", workDesignation="
				+ workDesignation + ", deptCode=" + deptCode + ", contractType=" + contractType + ", residencePermitNo="
				+ residencePermitNo + ", residencePermitIssueDate=" + residencePermitIssueDate
				+ ", residencePermitExpiryDate=" + residencePermitExpiryDate + ", passage=" + passage + ", ticket="
				+ ticket + ", basicSalary=" + basicSalary + ", bankCode=" + bankCode + ", acNumber=" + acNumber
				+ ", paymentMode=" + paymentMode + ", rentAllowance=" + rentAllowance + ", travelAllowance="
				+ travelAllowance + ", specialAllowance=" + specialAllowance + ", gosiAmount=" + gosiAmount
				+ ", housingBankAmount=" + housingBankAmount + ", telephoneGuarantee=" + telephoneGuarantee
				+ ", electricityGuarantee=" + electricityGuarantee + ", externalBankLoanGuarantee="
				+ externalBankLoanGuarantee + ", bankName=" + bankName + ", otherAllowance=" + otherAllowance
				+ ", nshAllowance=" + nshAllowance + ", loanInstallment=" + loanInstallment + ", divisionName="
				+ divisionName + ", deptName=" + deptName + "]";
	}



}
