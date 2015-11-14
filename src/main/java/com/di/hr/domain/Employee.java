package com.di.hr.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.di.crm.domain.Address;
import com.di.crm.domain.PhoneNumber;

@XmlRootElement
public class Employee {
	public enum GenderType {female, male};
	
	private String rowId;
	private String companyId;
	private String empId;
	private String departmentCode;
	private String positionCode;
	private String korName;
	private String englishName;
	private GenderType gender;
	private Address address;
	private PhoneNumber phoneNumber;
	
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	//TODO : add the properties within HR
	//-> must use builder pattern (idea from effective java)

	//TODO : 생성시에만 rowid를 set하도록 수정요!!
	
	public Employee() {}
	
	public Employee(String enlishName) {}
	
	public Employee(String rowId, String empId, String korName, String createdBy) {
		this.rowId = rowId;
		this.empId = empId;
		this.korName = korName;
		this.createdBy = createdBy;
	}
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public GenderType getFemaleType() {
		return GenderType.female;
	}
	
	public GenderType getMaleType() {
		return GenderType.male;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getKorName() {
		return korName;
	}

	public void setKorName(String korName) {
		this.korName = korName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}
