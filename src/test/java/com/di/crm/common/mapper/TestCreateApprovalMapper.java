package com.di.crm.common.mapper;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.*;
import org.junit.runner.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.di.approval.domain.Approval;
import com.di.crm.common.config.AppConfig;
import com.di.crm.common.mapper.ApprovalMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class TestCreateApprovalMapper {

	Logger logger = LoggerFactory.getLogger(TestCreateApprovalMapper.class);
	
	@Autowired ApprovalMapper approvalMapper;
	
	@Before
	public void setUp() {
		//테스트를 위한 초기화
		//TODO : DbUnit으로 대체요.
		approvalMapper.deleteApprovalAll();
	}
	
	@Test
	public void testInsertApproval() {
		Approval approval = new Approval();
		approval.setRowId("1-AAZZ1");
		approval.setApprovalId("20150202-000003");
		approval.setCreatedBy("1500001");
		assert(approvalMapper.insertApproval(approval) >= 1);
		
		List<Approval> appList = approvalMapper.selectAppWithLines();
		assertThat(appList.size(), is(1));
		
		
	}
}
