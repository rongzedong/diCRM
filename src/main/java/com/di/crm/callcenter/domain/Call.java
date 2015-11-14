package com.di.crm.callcenter.domain;

import java.util.Date;

public class Call {
	private String rowId;
	
	private String callId;
	
	private String createdBy;	//Employee's rowId
	private String changedBy;
	
	private Date createdDate;
	private Date modifiedDate;
	
	public Call(String callId) {
		this.callId = callId;
	}
	
	public String getCallId() {
		return this.callId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((callId == null) ? 0 : callId.hashCode());
		result = prime * result + ((rowId == null) ? 0 : rowId.hashCode());
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
		Call other = (Call) obj;
		if (callId == null) {
			if (other.callId != null)
				return false;
		} else if (!callId.equals(other.callId))
			return false;
		if (rowId == null) {
			if (other.rowId != null)
				return false;
		} else if (!rowId.equals(other.rowId))
			return false;
		return true;
	}
}
