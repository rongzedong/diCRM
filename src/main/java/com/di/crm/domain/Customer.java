package com.di.crm.domain;

import java.util.Date;

import com.di.crm.util.Code.CustomerType;

public class Customer {
	private String rowId;
	
	private String id;					//customer id
	private String firstName;
	private String lastName;
	
	private String companyName;
	private String corpRegNumber;
	
	private com.di.util.Code.CustomerType type;			//private/enterprise
	private String status;				//active, pending, delete
	private String grade;				//white, gray, red, blue, black, diamond
	
	private Address address;			//use address class(address1, address2, city,
										// gu, province, detail address), post number
	
	private PhoneNumber phoneNumber;	//phone number1, phone number 2, home phone number, company phone number
	private Email email;				//company email, private email, email 1, email 2,...

	private Date registeredDate;		//created date and registered date is different!!!
	
	private Date lastUpdated;
	private Date createdDate;
	
/*	public Customer(String companyName, CustomerType type) {
		this.companyName = companyName;
		this.type = type;
	}*/

	public Customer(String companyName, com.di.util.Code.CustomerType type) {
		this.companyName = companyName;
		this.type = type;
	}
	
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



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public com.di.util.Code.CustomerType getType() {
		return type;
	}



	public void setType(com.di.util.Code.CustomerType type) {
		this.type = type;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
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



	public Email getEmail() {
		return email;
	}



	public void setEmail(Email email) {
		this.email = email;
	}



	public Date getRegisteredDate() {
		return registeredDate;
	}



	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}



	public Date getLastUpdated() {
		return lastUpdated;
	}



	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	public String getCorpRegNumber() {
		return corpRegNumber;
	}

	public void setCorpRegNumber(String corpRegNumber) {
		this.corpRegNumber = corpRegNumber;
	}
}
