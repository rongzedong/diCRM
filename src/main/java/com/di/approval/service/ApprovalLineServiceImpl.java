package com.di.approval.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.di.approval.dao.ApprovalDao;
import com.di.approval.dao.ApprovalLineDao;
import com.di.approval.domain.ApprovalLine;

@Service(value="approvalLineService")
@Transactional(readOnly = true)
public class ApprovalLineServiceImpl implements ApprovalLineService {
	
	@Resource(name="approvalLineDao")
	private ApprovalLineDao approvalLineDao;
	
	@Resource(name="approvalDao")
	private ApprovalDao approvalDao;
	
	@Override
	public List<ApprovalLine> selectApprovalLineAll() {
		return this.approvalLineDao.selectAppLines();
	}

	@Override
	public ApprovalLine select(ApprovalLine approvalLine) {
		return this.approvalLineDao.selectAppLinesbyPkIds(approvalLine);
	}

	@Override
	public List<ApprovalLine> select(String approvalId) {
		return this.approvalLineDao.selectAppLinesbyAppId(approvalId);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int insert(ApprovalLine approvalLine) {
		if (approvalDao.selectWithLinesbyAppId(approvalLine.getApprovalId()) != null)
			return this.approvalLineDao.insertApprovalLine(approvalLine);
		return 0;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int deleteAll() {
		return this.approvalLineDao.deleteApprovalLineAll();
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int delete(ApprovalLine approvalLine) {
		return this.approvalLineDao.deleteApprovalLinebyPkId(approvalLine);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int updateApprovalLine(ApprovalLine approvalLine) {
		// TODO Auto-generated method stub
		return 0;
	}
}
