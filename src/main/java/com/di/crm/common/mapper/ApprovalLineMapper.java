package com.di.crm.common.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.di.approval.domain.ApprovalLine;

@Repository(value="approvalLineMapper")
public interface ApprovalLineMapper {
	
	/**
	 * 전체 결재 정보 조회
	 * TODO : 테스트용 - 삭제요 
	 * @return
	 */
	List<ApprovalLine> selectAppLines();
	
	/**
	 * 결재선 정보를 조회한다.
	 * 
	 * @param appId
	 * @return
	 */
	List<ApprovalLine> selectAppLinesbyAppId(String appId);
	
	/**
	 * 결재선 정보를 조회한다.(RowId 포함하여 조회)
	 * 
	 * @param approvalLine
	 * @return
	 */
	ApprovalLine selectAppLinesbyPkIds(ApprovalLine approvalLine);
	
	/**
	 * 결재선 정보를 추가한다.
	 * @param apprvLine
	 * @return
	 */
	int insertApprovalLine(ApprovalLine apprvLine);
	
	/**
	 * TODO : 테스트용 - 서비스에서는 삭제요
	 * 
	 * 결재선 정보 모두 삭제
	 * @return
	 */
	int deleteApprovalLineAll();
	
	/**
	 * Primary key를 이용하여 삭제(rowId & approvalId)
	 * 
	 * @param approvalLine
	 * @return
	 */
	int deleteApprovalLinebyPkId(ApprovalLine approvalLine);

}
