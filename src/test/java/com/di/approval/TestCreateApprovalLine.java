package com.di.approval;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.di.approval.domain.Approval;
import com.di.approval.domain.ApprovalLine;
import com.di.approval.service.ApprovalLineService;
import com.di.crm.common.config.AppConfig;
import com.di.util.Code.LineType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class TestCreateApprovalLine {
	
	private final String APPROVAL_SUBJECT = "Test_Approval";
	
	private final String FIRST_LINE = "1500001";	//the registration number in the company
	private final String SECOND_LINE = "1500002";	
	private final String THIRD_LINE = "1500003";
	
	private final String CORP_LINE_1 = "1500004";
	private final String SECRET_CORP_LINE_1 = "1500005";
	
	private final String NOTIFY_LINE_1 = "1500006";
	private final String NOTIFY_LINE_2 = "1500016";

	@Resource(name="approvalLineService")
	private ApprovalLineService service;
	
	private Approval approval;
	private ApprovalLine approvalLine;
	
	@Before
	public void setUp() {
		this.approval = new Approval();
		this.approvalLine = new ApprovalLine();
		
		builderApproval();
	}

	private void builderApproval() {
		this.approval.setSubject(APPROVAL_SUBJECT);
		this.approval.setRowId("1-AAZZBC");
		this.approval.setApprovalId("3-2015020400001");
		this.approval.setCreatedBy(SECOND_LINE);
	}
	
	@Test
	public void testCreateApprovalLine() throws Exception {
		
		service.deleteAll();
		List<ApprovalLine> list = service.selectApprovalLineAll();
		assertThat(list.size(), is(0));
		
		approvalLine = this.makeGeneralApprovalLine(approvalLine);
		
		this.service.insert(approvalLine);
		List<ApprovalLine> appLineList = this.service.selectApprovalLineAll();
		assertThat(appLineList.size(), is(1));
	}
	
	@Test
	public void testCreateFailNotExistApprovalId() {
		ApprovalLine failApprovalLine = new ApprovalLine();
		
		failApprovalLine = makeGeneralApprovalLine(failApprovalLine);
		failApprovalLine.setApprovalId("XXXXXX"); 	//NOT EXIST approvalId
		int nResult = this.service.insert(failApprovalLine);
		assertThat(nResult, is(0));
	}
	
	@Test
	public void testMultiApprovalLines() throws Exception {
		
		service.deleteAll();
		assertThat(service.selectApprovalLineAll().size(), is(0));
		
		List<ApprovalLine> lineList = this.makeApprovalLines();
		
		for(ApprovalLine approvalLine : lineList) {
			service.insert(approvalLine);
		}
		
		assertThat(lineList.size(), is(service.selectApprovalLineAll().size()));
	}
	
	@Test
	public void testDeleteApprovalLine() {
		List<ApprovalLine> lineList = service.select("2-2015020400001");
		if (lineList.size() >= 6) {
			ApprovalLine delApprovalLine = lineList.get(5);
			service.delete(delApprovalLine);
			
			assertThat(service.selectApprovalLineAll().size(), is(lineList.size() - 1));
		}
	}
	
	@Test
	public void testFailDeleteApprovalLineWrongAppId() {
		List<ApprovalLine> lineList = service.selectApprovalLineAll();
		if (lineList != null && lineList.size() > 0) {
			ApprovalLine failDeleteLine = lineList.get(0);
			failDeleteLine.setApprovalId("XXXXXX");
			service.delete(failDeleteLine);
			
			assertThat(service.selectApprovalLineAll().size(), is(lineList.size()));
		}
	}
	
	/**
	 * 테스트를 위한 일반적인 ApprovalLine 생성 - 중복 부분 삭제용
	 * @param approvalLine
	 * @return
	 */
	private ApprovalLine makeGeneralApprovalLine(ApprovalLine approvalLine) {
		approvalLine.setRowId("1-AAZZBE");
		approvalLine.setApprovalId("2-2015020400001");
		approvalLine.setLineType(LineType.APPROVAL);
		approvalLine.setSeq(0);
		approvalLine.setCreatedBy(THIRD_LINE);
		
		return approvalLine;
	}
	
	private List<ApprovalLine> makeApprovalLines() {
		List<ApprovalLine> list = new LinkedList<ApprovalLine>();
		
		ApprovalLine approvalLine1 = new ApprovalLine("1-AAZZBG","2-2015020400001", SECOND_LINE, 1, LineType.APPROVAL);
		ApprovalLine approvalLineCorp1 = new ApprovalLine("1-AAZZBH","2-2015020400001", CORP_LINE_1, 2, LineType.CORPORATION);
		ApprovalLine approvalLineRef1 = new ApprovalLine("1-AAZZBI","2-2015020400001", SECRET_CORP_LINE_1, 3, LineType.SECRET_REF);
		ApprovalLine approvalLineNoty1 = new ApprovalLine("1-AAZZBJ","2-2015020400001", NOTIFY_LINE_2, 4, LineType.NOTIFICATION);
		ApprovalLine approvalLineNoty2 = new ApprovalLine("1-AAZZBK","2-2015020400001", NOTIFY_LINE_1, 5, LineType.NOTIFICATION);
		
		approvalLine1.setCreatedBy(FIRST_LINE);
		approvalLineCorp1.setCreatedBy(FIRST_LINE);
		approvalLineRef1.setCreatedBy(FIRST_LINE);
		approvalLineNoty1.setCreatedBy(FIRST_LINE);
		approvalLineNoty2.setCreatedBy(FIRST_LINE);
		
		list.add(approvalLine1);
		list.add(approvalLineCorp1);
		list.add(approvalLineRef1);
		list.add(approvalLineNoty1);
		list.add(approvalLineNoty2);
		
		return list;
	}
}
