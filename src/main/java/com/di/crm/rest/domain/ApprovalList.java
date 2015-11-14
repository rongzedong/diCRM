package com.di.crm.rest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.di.approval.domain.Approval;

@XmlRootElement(name="approvalList")
public class ApprovalList {
	private List<Approval> approvals;
	
	public ApprovalList() {}
	
	public ApprovalList(List<Approval> approvals) {
		this.setApprovalList(approvals);
	}
	
	@XmlElement(name="approval")
	public List<Approval> getApprovals() {
		return approvals;
	}
	
	public void setApprovalList(List<Approval> approvals) {
		this.approvals = approvals;
	}
}