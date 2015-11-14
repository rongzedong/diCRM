package com.di.approval.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.di.approval.domain.ApprovalLine;
import com.di.crm.common.mapper.ApprovalLineMapper;

@Component
@Repository(value="approvalLineDao")
public class ApprovalLineDaoImpl implements ApprovalLineDao {

	@Autowired
	private ApprovalLineMapper approvalLineMapper;
	
	@Override
	public List<ApprovalLine> selectAppLines() {
		return this.approvalLineMapper.selectAppLines();
	}

	@Override
	public List<ApprovalLine> selectAppLinesbyAppId(String approvalId) {
		return this.approvalLineMapper.selectAppLinesbyAppId(approvalId);
	}

	@Override
	public ApprovalLine selectAppLinesbyPkIds(ApprovalLine approvalLine) {
		return this.approvalLineMapper.selectAppLinesbyPkIds(approvalLine);
	}
	
	@Override
	public int insertApprovalLine(ApprovalLine approvalLine) {
		return this.approvalLineMapper.insertApprovalLine(approvalLine);
	}

	@Override
	public int deleteApprovalLineAll() {
		return this.approvalLineMapper.deleteApprovalLineAll();
	}

	@Override
	public int deleteApprovalLinebyPkId(ApprovalLine approvalLine) {
		return this.approvalLineMapper.deleteApprovalLinebyPkId(approvalLine);
	}

}
