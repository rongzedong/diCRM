package com.di.approval.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.di.approval.domain.Approval;
import com.di.crm.common.mapper.ApprovalMapper;

@Component
@Repository(value="approvalDao")
public class ApprovalDaoImpl implements ApprovalDao {

	@Autowired
	private ApprovalMapper approvalMapper;
	
	@Override
	public List<Approval> selectAppWithLines() {
		return this.approvalMapper.selectAppWithLines();
	}
	
	@Override
	public Approval selectWithLinesbyPkId(Approval approval) {
		return this.approvalMapper.selectWithLinesbyPkId(approval);
	}

	@Override
	public Approval selectWithLinesbyAppId(String approvalId) {
		return this.approvalMapper.selectWithLinesbyAppId(approvalId);
	}
	
	@Override
	public int insertApproval(Approval approval) {
		return this.approvalMapper.insertApproval(approval);
	}

	@Override
	public int deleteApprovalAll() {
		return this.approvalMapper.deleteApprovalAll();
	}

	@Override
	public int deleteApprovalbyPkId(Approval approval) {
		return this.approvalMapper.deleteApprovalbyPkId(approval);
	}
	
	@Override
	public int updateApproval(Approval approval) {
		return this.approvalMapper.updateApproval(approval);
	}
}
