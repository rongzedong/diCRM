package com.di.crm.sfa.pipeline;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.di.util.Currency;

public class TestCreateProject {
	/*
	private final String PROJECT_NAME = "SEC_CRM_PROJECT";
	private final String PROJECT_MGR = "1500001";
	private final String SALES_PERSON = "1500002";
	private final Double PROJECT_TOTAL_AMT = 123456.11;
	private final Double PROJECT_PROFIT_RATE = 5.1;
	private final Currency PROJECT_CURRENCY;
	
	private PipelineManager manager = null;
	private SalesProejct project = null;
	private Employee projectManager = null;
	private Employee salesPerson = null;
	
	private String projectId = null;
	
	@Before
	public void SetUp() {
		manager = new ElectronicSalesPipelineManager(); 
		project = new ElectronicSalesProjectImpl();
		
		PROJECT_CURRENCY = new Currency();
		PROJECT_CURRENCY.setCurrency("USD");
	}
	
	@Test
	public void testCreateProject() {
		project.setProjectName(PROJECT_NAME);
		project.setProjectManager(PROJECT_MGR);
		project.setSalesPerson(SALES_PERSON);
		project.setContent("CRM DEV PROJECT");
		project.setTotalAmount(PROJECT_TOTAL_AMT);
		project.setProfitRate(PROJECT_PROFIT_RATE);
		project.setCurrency(PROJECT_CURRENCY);
		
		manager.register(project);
		SalesProject registerProject = manager.search(project);
		projectId = registerProject.getProjectId();
		
		assertNotNull(projectId);
		assertThat(registerProject, is(project));
		assertThat(registerProject.getStatus, is(Project.READY)));	
	}
	
	@Test
	public void testRegisterProject() {
		
		
	}
	
	@Test
	public void testIsNeededConfirmProcess() {
		
	}
	
	@Test
	public void testConfirmProcess() {
		
	}
	
	@Test
	public void testPlanningAfterConfirm() {
		
	}
	
	@Test
	public void testDetermineProjectDef() {
		//Nomral, Urgent, need to pass the project managerment committee
		
	}
	*/
}
