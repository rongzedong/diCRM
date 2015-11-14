package com.di.crm.common.user.domain;

import java.util.Date;
import java.util.List;

public class User {
	private String rowId;
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;			// 성별(hr에 포함되어 있으면 저장용)
	private String password;
	private String phoneNumber;
	private String mobileNumber;
	private String address;
	private String createdAt;
	private String status;
	private String desc;			// 기타 description

	private String compnayEmail;	// 회사이메일
	private String privateEmail;	// 개인이메일 - 기타 연락처 
	private String companyId;		// 사번
	private String companyRole;		// 직책
	private String companyName;		// 소속명
	private List<String> roleList;	// responsibility(복수개 가능)
	
	private Date created;
	private Date updated;
	private String createdBy;
	private String updatedBy;
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCompnayEmail() {
		return compnayEmail;
	}
	public void setCompnayEmail(String compnayEmail) {
		this.compnayEmail = compnayEmail;
	}
	public String getPrivateEmail() {
		return privateEmail;
	}
	public void setPrivateEmail(String privateEmail) {
		this.privateEmail = privateEmail;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<String> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Override
	public String toString() {
		return "User [rowId=" + rowId + ", id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", createdAt="
				+ createdAt + ", status=" + status + ", desc=" + desc
				+ ", compnayEmail=" + compnayEmail + ", privateEmail="
				+ privateEmail + ", companyId=" + companyId + ", companyRole="
				+ companyRole + ", companyName=" + companyName + ", roleList="
				+ roleList + ", created=" + created + ", updated=" + updated
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
}
