package com.di.crm.domain;

public class Address {
	private String rowId;
	private String customerId;

	private String postNumber;
	private String province;
	private String city;
	private String detailAddress;

	public String getRowId() {
		return rowId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	@Override
	public String toString() {
		return "Address [rowId=" + rowId + ", customerId=" + customerId
				+ ", postNumber=" + postNumber + ", province=" + province
				+ ", city=" + city + ", detailAddress=" + detailAddress + "]";
	}
	
}
