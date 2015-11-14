package com.di.crm.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.di.approval.domain.Approval;

@Repository(value="approvalMapper")
public interface ApprovalMapper {

	/**
	 * 전체 결재 정보 조회
	 * TODO : 테스트용 - 삭제요 
	 * @return
	 */
	List<Approval> selectAppWithLines();
	
	/**
	 * 결재정보를 조회한다.(Approval id & rowId 이용)
	 * 
	 * @param appId
	 * @return
	 */
	Approval selectWithLinesbyPkId(Approval approval);

	/**
	 * 결재정보를 조회한다. (Approval Id로 조회)
	 * @param approvalId
	 * @return
	 */
	Approval selectWithLinesbyAppId(String approvalId);
	
	/**
	 * 결재 정보를 생성한다.
	 * @param approval
	 * @return
	 */
	int insertApproval(Approval approval);
	
	/**
	 * TODO : 테스트용 - 서비스에서는 삭제요
	 * 
	 * 결재정보 모두 삭제
	 * @return
	 */
	int deleteApprovalAll();
	
	/**
	 * Primary key를 이용하여 삭제(rowId & approvalId)
	 * 
	 * @param approval
	 * @return
	 */
	int deleteApprovalbyPkId(Approval approval);
	
	/**
	 * 결재정보를 수정한다.
	 * 
	 * @param approval
	 * @return
	 */
	int updateApproval(Approval approval);
}
