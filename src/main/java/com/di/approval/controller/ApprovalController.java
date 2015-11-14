package com.di.approval.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.di.approval.domain.Approval;
import com.di.util.Code.LineType;

public interface ApprovalController {
	public void setApprovalManager(ApprovalValidateManager validateManager);
	public void setApproval(Approval approval);
	
	public ModelAndView listAll(ModelMap model) throws Exception;
	public ModelAndView viewApprovalDetail(HttpServletRequest request);
	public void addApprvLine(String employeeNumber, LineType type, int seq) throws Exception;
	public int countLineNumbers();
}
