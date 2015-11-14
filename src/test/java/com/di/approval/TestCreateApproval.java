package com.di.approval;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.di.approval.domain.Approval;
import com.di.approval.service.ApprovalService;
import com.di.crm.common.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class TestCreateApproval {
	
	@Resource(name="approvalService")
	private ApprovalService service;
	
	private Approval approval = null;
	
	@Before
	public void setUp() {
		approval = new Approval();
	}

	@Test
	public void testCreateApproval() {
		service.deleteAll();
		List<Approval> appList = service.selectApprovalAll();
		
		assertThat(appList.size(), is(0));
		
		approval.setSubject("Test Approval Subject!!");
		approval.setRowId("1-AAZZBB");
		approval.setApprovalId("2-2015020400001");
		approval.setCreatedBy("1500001");
		
		service.insert(approval);
		appList = service.selectApprovalAll();
		assertThat(appList.size(),is(1));
	}
	
	@Test
	//TODO : Blob data update test!!
	public void testUpdateBlobContent() throws Exception {
		//Blob content;
		//approval.setContent("<html><header></header><body>Test Approval</body></html> ");
		
		//TODO : Blob access
		/*BufferedInputStream in = new BufferedInputStream(blob.getBinaryStream());
        int nFileSize = (int)blob.length();
        byte[] buf = new byte [nFileSize];   
        int nReadSize = in.read(buf, 0, nFileSize);
        in.close();

         // contents -> BLOB 데이터가 저장될 String
        String contents = new String(buf);
		*/
	}
}
