package com.di.crm.sfa.pipeline;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.di.crm.sfa.domain.*;

/**
 * 
 * @author hyun
 *
 */

public class TestNormalProjectProcess {
	private Action action = null;
	private Quote quote = null;
	private Bid bidResult = null;
	private Contract contract = null;
	
	@Before
	public void setUp() {
		
	}

	//TODO : 매단계 수행마다 ACTION 생성 -> 프로젝트만 보면 상태 조회가능~
	
	//Normal Proecss - without exception
	@Test
	public void testDetermineNeedQuote() {
		
	}
	
	@Test
	public void testMakingQuote() {
		
	}
	
	@Test
	public void testConfirmQuote() {
		
	}
	
	@Test
	public void testRegisterBidResult() {
		
	}
	
	@Test
	public void testNegotiatingWithClient() {
		
	}
	
	@Test
	public void testChangeQuote() {
		
	}
	
	@Test
	public void testRegisterContractInfo() {
		
	}
	
	@Test
	public void testRegisterDeliveryPlan() {
		
	}
	
	@Test
	public void testRegisterBillingPlan() {
		
	}
	
	@Test
	public void testRegisterDeliveryResult() {
		
	}
	@Test
	public void testConfirmBillingResult() {
		
		
	}
}