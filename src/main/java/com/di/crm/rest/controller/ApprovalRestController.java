package com.di.crm.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.di.approval.domain.Approval;
import com.di.approval.service.ApprovalService;

@Controller
@RequestMapping(value="/rest/approvals")
public class ApprovalRestController {

	@Autowired
	ApprovalService approvalService;

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Approval> getApprovals() {
		List<Approval> approvals = approvalService.selectApprovalAll();
		return approvals;
	}
	
	@RequestMapping(value="/{appId}", method=RequestMethod.GET)
	@ResponseBody
	public Approval getApproval(@PathVariable("appId") String appId) {
		return approvalService.select(appId);
	}
}