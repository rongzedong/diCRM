package com.di.approval.service;

import java.util.List;
import com.di.approval.domain.Approval;

public interface ApprovalService {
	
	public List<Approval> selectApprovalAll();
	
	public Approval select(Approval approval);
	
	public Approval select(String approvalId);
	
	public int insert(Approval approval);
	
	public int deleteAll();
	
	public int delete(Approval approval);
	
	int updateApproval(Approval approval);
}
