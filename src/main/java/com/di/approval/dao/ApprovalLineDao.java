package com.di.approval.dao;

import java.util.List;

import com.di.approval.domain.ApprovalLine;

public interface ApprovalLineDao {
	List<ApprovalLine> selectAppLines();
	ApprovalLine selectAppLinesbyPkIds(ApprovalLine approvalLine);
	List<ApprovalLine> selectAppLinesbyAppId(String approvalId);
	int insertApprovalLine(ApprovalLine approvalLine);
	int deleteApprovalLineAll();
	int deleteApprovalLinebyPkId(ApprovalLine approvalLine);
}
