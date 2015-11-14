package com.di.engine.domain;

import java.util.Date;
import java.util.List;

public class Opportunity {

	private String rowid;
	
	private String opportunityName;
	private Date startDate;
	private Date endDate;
	private String customId;
	private String customName;
	private String desc;
	private String relatedOpportunityId;
	private String fromLeadId;
	private List<Action> relatedActionList;
	private String stepId;		// 사용자가 임의로 step 가정 가능
	private String state;		// 상태
	private Date createDate;
	private Date updateDate;
	private String createdBy;
	private String updatedBy;
	public String getRowid() {
		return rowid;
	}
	public void setRowid(String rowid) {
		this.rowid = rowid;
	}
	public String getOpportunityName() {
		return opportunityName;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCustomId() {
		return customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRelatedOpportunityId() {
		return relatedOpportunityId;
	}
	public void setRelatedOpportunityId(String relatedOpportunityId) {
		this.relatedOpportunityId = relatedOpportunityId;
	}
	public String getFromLeadId() {
		return fromLeadId;
	}
	public void setFromLeadId(String fromLeadId) {
		this.fromLeadId = fromLeadId;
	}
	public List<Action> getRelatedActionList() {
		return relatedActionList;
	}
	public void setRelatedActionList(List<Action> relatedActionList) {
		this.relatedActionList = relatedActionList;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
		return "Opportunity [rowid=" + rowid + ", opportunityName="
				+ opportunityName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", customId=" + customId + ", customName="
				+ customName + ", desc=" + desc + ", relatedOpportunityId="
				+ relatedOpportunityId + ", fromLeadId=" + fromLeadId
				+ ", relatedActionList=" + relatedActionList + ", stepId="
				+ stepId + ", state=" + state + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}
}
