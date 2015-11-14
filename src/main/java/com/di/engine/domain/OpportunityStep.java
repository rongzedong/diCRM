package com.di.engine.domain;

import java.util.Date;

public class OpportunityStep {
	private String rowId;
	
	private String name;
	private int sequence;
	private String state;
	private String desc;
	
	private Date createDate;
	private Date updateDate;
	private String createdBy;
	private String updatedBy;
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
		return "OpportunityStep [rowId=" + rowId + ", name=" + name
				+ ", sequence=" + sequence + ", state=" + state + ", desc="
				+ desc + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + "]";
	}

	
}
