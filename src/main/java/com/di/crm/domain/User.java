package com.di.crm.domain;

import java.util.Date;
import java.util.List;

public class User {
	private String rowid;
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;			// 성별(hr에 포함되어 있으면 저장용)
	private String password;
	private String phonenumber;
	private String mobilenumber;
	private String address;
	private String createdat;
	private String status;
	private String desc;			// 기타 description

	private String compnayemail;	// 회사이메일
	private String privateemail;	// 개인이메일 - 기타 연락처 
	private String companyid;		// 사번
	private String companyrole;		// 직책
	private String companyname;		// 소속명
	private List<String> roleList;	// responsibility(복수개 가능)
	
	private Date created;
	private Date updated;
	private String createdby;
	private String updatedby;
	public String getRowid() {
		return rowid;
	}
	public void setRowid(String rowid) {
		this.rowid = rowid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedat() {
		return createdat;
	}
	public void setCreatedat(String createdat) {
		this.createdat = createdat;
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
	public String getCompnayemail() {
		return compnayemail;
	}
	public void setCompnayemail(String compnayemail) {
		this.compnayemail = compnayemail;
	}
	public String getPrivateemail() {
		return privateemail;
	}
	public void setPrivateemail(String privateemail) {
		this.privateemail = privateemail;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getCompanyrole() {
		return companyrole;
	}
	public void setCompanyrole(String companyrole) {
		this.companyrole = companyrole;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	@Override
	public String toString() {
		return "User [rowid=" + rowid + ", id=" + id + ", firstname="
				+ firstname + ", lastname=" + lastname + ", age=" + age
				+ ", gender=" + gender + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", mobilenumber="
				+ mobilenumber + ", address=" + address + ", createdat="
				+ createdat + ", status=" + status + ", desc=" + desc
				+ ", compnayemail=" + compnayemail + ", privateemail="
				+ privateemail + ", companyid=" + companyid + ", companyrole="
				+ companyrole + ", companyname=" + companyname + ", roleList="
				+ roleList + ", created=" + created + ", updated=" + updated
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}
}
