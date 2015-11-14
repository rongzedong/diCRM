package com.di.approval.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.di.util.Code.LineType;

@XmlRootElement
public class ApprovalLine {

	private String rowId;
	private String approvalId;
	private int seq = 0;
	private LineType lineType;
	private String employeeNumber;
	private boolean deleteFlag = false;

	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	public ApprovalLine() {}
	
	public ApprovalLine(String rowId, String approvalId, String employeeNumber, int seq, LineType lineType) {
		this.rowId = rowId;
		this.approvalId = approvalId;
		this.employeeNumber = employeeNumber;
		this.seq = seq;
		this.lineType = lineType;
	}
	
	public String getRowId() {
		return rowId;
	}
	public String getApprovalId() {
		return approvalId;
	}
	//TODO : 테스트용 - 삭제요~(ROWID를 SET할수는 없음!!)
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public LineType getLineType() {
		return lineType;
	}
	public void setLineType(LineType lineType) {
		this.lineType = lineType;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public boolean getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	//TODO : 테스트 후 삭제요(ROWID의 SET과 유사)
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
}
