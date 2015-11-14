package com.di.approval.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.di.approval.dao.ApprovalDao;
import com.di.approval.domain.Approval;

@Service(value="approvalService")
@Transactional(readOnly = true)
public class ApprovalServiceImpl implements ApprovalService {

	@Resource(name="approvalDao")
	private ApprovalDao approvalDao;

	@Override
	public List<Approval> selectApprovalAll() {
		return approvalDao.selectAppWithLines();
	}

	@Override
	public Approval select(Approval approval) {
		return approvalDao.selectWithLinesbyPkId(approval);
	}

	@Override
	public Approval select(String approvalId) {
		return approvalDao.selectWithLinesbyAppId(approvalId);
	}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int insert(Approval approval) {
		return approvalDao.insertApproval(approval);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int deleteAll() {
		return approvalDao.deleteApprovalAll();
	}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int delete(Approval approval) {
		return approvalDao.deleteApprovalbyPkId(approval);
	}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int updateApproval(Approval approval) {
		return approvalDao.updateApproval(approval);
	}
}