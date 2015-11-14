package com.di.util;

import java.util.*;

public class Currency {
	private String currency;
	private Date stdDate;
	private Double fromWonToChangePrice;
	private Double toWonChangePrice;

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getStdDate() {
		return stdDate;
	}
	public void setStdDate(Date stdDate) {
		this.stdDate = stdDate;
	}
	public Double getFromWonToChangePrice() {
		return fromWonToChangePrice;
	}
	public void setFromWonToChangePrice(Double fromWonToChangePrice) {
		this.fromWonToChangePrice = fromWonToChangePrice;
	}
	public Double getToWonChangePrice() {
		return toWonChangePrice;
	}
	public void setToWonChangePrice(Double toWonChangePrice) {
		this.toWonChangePrice = toWonChangePrice;
	}
}
