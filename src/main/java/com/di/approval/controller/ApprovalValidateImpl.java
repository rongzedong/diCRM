package com.di.approval.controller;

import java.util.List;

import com.di.approval.domain.ApprovalLine;
import com.di.util.VallidateUtil;

public class ApprovalValidateImpl implements ApprovalValidate {
	private ApprovalLine apprvLine = null;
	private List<ApprovalLine> mapApprovalLine = null;
	private VallidateUtil util = null;

	public void getValidateUtil(VallidateUtil util) {
		this.util = util;
	}
	
	public void getApprovalInfo(ApprovalLine apprvLine, List<ApprovalLine> mapApprovalLine) {
		this.apprvLine = apprvLine;
		this.mapApprovalLine = mapApprovalLine;
	}
	
	public boolean execute() {
		for(ApprovalLine savedLine : mapApprovalLine) {
			if (!isValidatedLine(savedLine)) {
				return false;
			}
		}
		return true;	
	}
	
	private boolean isValidatedLine(ApprovalLine savedLine) {
		String addedEmp = this.apprvLine.getEmployeeNumber();
		int addedSeq = this.apprvLine.getSeq();
		
		if (util.isNotNullString(addedEmp, savedLine.getEmployeeNumber()) &&
			util.isNotEqualInt(addedSeq, savedLine.getSeq())) {
			return true;
		}
		
		return false;
	}
}
