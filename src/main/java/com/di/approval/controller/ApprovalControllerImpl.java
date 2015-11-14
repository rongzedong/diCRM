package com.di.approval.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.di.approval.domain.Approval;
import com.di.approval.domain.ApprovalLine;
import com.di.approval.service.ApprovalService;
import com.di.util.Code.LineType;

@RequestMapping("/approval")
@Controller(value="approvalController")
public class ApprovalControllerImpl implements ApprovalController {

	@Resource(name="approvalService")
	private ApprovalService approvalService;
	
	private Approval approval;
	private List<ApprovalLine> mapApprovalLine;			
	private Map<String, String> mapAttachedFile;
	private ApprovalValidateManager validateManager;
	
	public void setApproval(Approval approval) {
		this.approval = approval;
		this.mapApprovalLine = approval.getMapApprovalLine();
		this.mapAttachedFile = approval.getMapAttachedFile();
	}
	
	public void setApprovalManager(ApprovalValidateManager validateManager) {
		this.validateManager = validateManager;
	}
	
	@RequestMapping(value="/")
	public ModelAndView listAll(ModelMap model) throws Exception {
		
		Map<String, List<Approval>> modelData = new HashMap<String, List<Approval>>();
		modelData.put("appList", approvalService.selectApprovalAll());
		return new ModelAndView("approvalList", modelData);
	}
	
	@RequestMapping(params = "apAction=view", method = RequestMethod.GET)
	public ModelAndView viewApprovalDetail(HttpServletRequest request) {
		
		Approval searchApporval = new Approval();
		searchApporval.setRowId(request.getParameter("rowId"));
		searchApporval.setApprovalId(request.getParameter("approvalId"));
		searchApporval.setCreatedBy(request.getParameter("createdBy"));
		
		Approval approval = approvalService.select(searchApporval);

		if (approval == null) {
			throw new RuntimeException("편집가능한 결재정보가 없습니다.");
		}
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute(approval);
		return new ModelAndView("approvalEdit", modelMap);
	}
	
	@RequestMapping(params = "apAction=edit", method = RequestMethod.POST)
	public ModelAndView editApproval(
			@RequestParam MultiValueMap<String, String> params) {

		//TODO : 테스트용 - 항목 추가요~
		String rowId = params.get("rowId").get(0);
		String approvalId = params.get("approvalId").get(0);
		String subject = params.get("subject").get(0);
		String createdby = params.get("createdBy").get(0);

		Map<String, Object> modelData = new HashMap<String, Object>();

		Approval approval = new Approval();
		approval.setRowId(rowId);
		approval.setApprovalId(approvalId);
		approval.setSubject(subject);
		approval.setCreatedBy(createdby);

		if (modelData.size() > 0) { // --this means there are validation errors
			modelData.put("approvalDetail", approval);
			return new ModelAndView("editApprovalForm", modelData);
		} else {
			approvalService.updateApproval(approval);
			return new ModelAndView("redirect:/approval/");
		}
	}
	
	@RequestMapping(params = "apAction=del", method = RequestMethod.GET)
	public String deleteApproval(
			@RequestParam MultiValueMap<String, String> params) {
		
		String rowId = params.get("rowId").get(0);
		String approvalId = params.get("approvalId").get(0);
		
		Approval delApproval = new Approval();
		delApproval.setRowId(rowId);
		delApproval.setApprovalId(approvalId);

		approvalService.delete(delApproval);
		return "redirect:/approval/";
	}
	
	public void addApprvLine(String employeeNumber, LineType type, int seq) throws Exception {
		ApprovalLine apprvLine = new ApprovalLine();

		apprvLine.setEmployeeNumber(employeeNumber);
		apprvLine.setSeq(seq);
		apprvLine.setLineType(type);
		
		if (validateManager.execute()) {
			mapApprovalLine.add(apprvLine);
		}
	}
	
	public int countLineNumbers() {
		return mapApprovalLine.size();
	}
}
