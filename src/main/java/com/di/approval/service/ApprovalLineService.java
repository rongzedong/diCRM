package com.di.approval.service;

import java.util.List;

import com.di.approval.domain.ApprovalLine;

public interface ApprovalLineService {
	public List<ApprovalLine> selectApprovalLineAll();	
	
	public ApprovalLine select(ApprovalLine approvalLine);
	
	public List<ApprovalLine> select(String approvalId);
	
	public int insert(ApprovalLine approvalLine);
	
	public int deleteAll();
	
	public int delete(ApprovalLine approvalLine);
	
	int updateApprovalLine(ApprovalLine approvalLine);
}
