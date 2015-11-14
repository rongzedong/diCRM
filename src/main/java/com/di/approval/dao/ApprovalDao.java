package com.di.approval.dao;

import java.util.List;

import com.di.approval.domain.Approval;

public interface ApprovalDao {

	public List<Approval> selectAppWithLines();
	
	public Approval selectWithLinesbyPkId(Approval approval);
	
	public Approval selectWithLinesbyAppId(String approvalId);
	
	public int insertApproval(Approval approval);
	
	public int deleteApprovalAll();
	
	public int deleteApprovalbyPkId(Approval approval); 
	
	int updateApproval(Approval approval);
	
}
