package com.di.approval.controller;

import java.util.List;

import com.di.crm.*;
import com.di.approval.domain.ApprovalLine;

public interface ApprovalValidate extends Validate {
	public void getApprovalInfo(ApprovalLine apprvLine, List<ApprovalLine> mapApprovalLine);
}
