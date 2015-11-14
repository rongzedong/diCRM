package com.di.crm.customer.ci;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;

import com.di.approval.controller.ApprovalControllerImpl;
import com.di.approval.domain.Approval;
import com.di.util.Code.*;

public class TestBatchApproval {

	private final String FIRST_LINE = "1500001";	//the registration number in the company
	private final String SECOND_LINE = "1500002";	
	private final String THIRD_LINE = "1500003";
	private final String FOURTH_LINE = "1500004";
	
	private final String ATT_FILE_URL = "/home/sthyun/Program/sts/"
										+ "workspace/crm/data/background_front.png";
	
	private final String subject = "Register to calculcate the customer index monthly.";
	private final String content = "I want to register the new batch job!! [content : customer index]";

	private ApprovalControllerImpl service = null;
	private Approval approval = null; 
	private String approveRowId = null;
	
	@Before
	public void setUp() {
		service = new ApprovalControllerImpl();
		approval = new Approval(); 
	}
	
	/*
	@Test
	public void testRegisterApproval() {
		approval.setContent(content);
		approval.setType(Type.ARBITRARY_MANAGER);
		approval.setApprovalLine(FIRST_LINE, LineType.APPROVAL, 1);
		approval.setApprovalLine(SECOND_LINE, LineType.APPROVAL, 2);
		approval.addAttachFile(ATT_FILE_URL);
		
		approveRowId = service.register(approval);
		assertNotNull(approveRowId);
		assertThat(service.search(approveRowId), is(approval));
	}
	
	@Test
	public void testChangeApprovalLine() {
		Approval registeredApproval = service.search(approveRowId);
				
		assertThat(registeredApproval, is(approval));
		assertThat(registeredApproval.getStatus(), is(ApproveResult.CREATING));
		
		approval.changeApprovalLine(FIRST_LINE, THIRD_LINE, 1);
		service.changeApproval(approveRowId, approval);
		
		Approval changeApproval = service.search(approval);
		assertThat(changeApproval.getApprovalLine(1), is(THIRD_LINE));
	}
	
	@Test(expected=RuntimeException.class)
	public void testTryChangeLineDuringApprovalGoing() {
		Approval registeredApproval = service.search(approveRowId);
		
		assertThat(registeredApproval, is(approval));
		assertThat(registeredApproval.getStatus(), is(ApproveResult.CREATING));
		
		service.startApproval(registeredApproval);
		
		Approval startedApproval = service.search(approveRowId);
		assertThat(startedApproval, is(approval));
		assertThat(startedApproval.getStatus(), is(ApproveResult.ONGOING));
		
		registeredApproval.changeApprovalLine(FIRST_LINE, THIRD_LINE, 1);
		service.changeApproval(approval);
	}
	
	@Test
	public void testDeleteApporvalLine() {
		Approval registeredApproval = service.search(approveRowId);
		
		assertThat(registeredApproval, is(approval));
		registerdApproval.deleteApprvLine(1);
		
		service.changeApproval(registeredApproval);
	}
	
	@Test
	public void testAddApporvalLine() {
		Approval registeredApproval = service.search(approveRowId);
		
		assertThat(registeredApproval, is(approval));
		registerdApproval.addApprvLine(3, FOURTH_LINE);
		
		service.changeApproval(registeredApproval);
		
		Apprvoval changedApproval = service.search(registeredApproval);
		assertThat(changedApproval.getApprvLine(3), is(FOURTH_LINE));
	}
	
	@Test
	public void testSearchNotExistedApprvLine() {
		Approval registeredApproval = service.search(approveRowId);
		
		assertThat(registeredApproval, is(approval));
		assertNull(registeredApproval.getApprvLine(999));
	}
	
	@Test(expected=DuplicateApprovalLineException.class)
	public void testSetDuplicateLine() {
		assertThat(service.search(approveRowId), is(approval));
		
		approval.changeApprovalLine(SECOND_LINE, THIRD_LINE, 2);
	}
	
	//TODO : 필수입력 정보 CHECK!!!
	
	@Test
	public void testApprovalNormalProcessWithApprovalAll() {
		assertNotNull(approveRowId);
		assertThat(service.search(approveRowId), is(approval));
		
		service.startApproval(approval);
		assertThat(approval.getStatus(), is(ApproveResult.ONGOING));
		
		service.approve(approval, 1, ApproveLineResult.APPROVAL);
		Approval afterApproval = service.search(approval);
		
		assertThat(afterApproval.getApprvLineStatus(1), is(ApproveLineResult.APPROVAL));
		assertThat(afterApproval.getApprvLineStatus(2), is(ApproveLineResult.READY));
		assertThat(afterApproval.getApproveStatus(), is(ApproveResult.ONGOING));
		
		service.approve(approval, 2, ApproveLineResult.APPROVAL);
		afterApproval = service.search(approval);
		assertThat(afterApproval.getApprvLineStatus(1), is(ApproveLineResult.APPROVAL));
		assertThat(afterApproval.getApprvLineStatus(2), is(ApproveLineResult.APPROVAL));
		assertThat(afterApproval.getApproveStatus(), is(ApproveResult.APPROVAL));
		
		afterApproval = service.search(approval);
		String approvalId = afterApproval.getApprovalId();
		assertNotNull(approvalId); //approval id(not approval's rowid)
		assertThat(service.search(approvalId), is(approval));
	}
	
	@Test
	public void testApprovalIncludingDeny() {
		
	}
	
	@Test
	public void testRetryApporval() {
		
	}
	
	@Test
	public void testSendEmailDuringApprovalStep() {
		
	}
	*/
}
