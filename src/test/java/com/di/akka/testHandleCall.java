package com.di.akka;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import com.di.crm.callcenter.CallReceiver;
import com.di.crm.callcenter.domain.Call;

//TODO : using thread!!! - register and distribute the calls to the clients!!!

public class testHandleCall {

	private String SAMPLE_CALL_ID_1 = "201501310000001";
	private String SAMPLE_CALL_ID_2 = "201501310000002";
	private String SAMPLE_CALL_ID_3 = "201501310000003";
	private String SAMPLE_CALL_ID_4 = "201501310000004";
	
	private AkkaServer server = null;
	private CallReceiver client1 = null;
	private CallReceiver client2 = null;
	
	Call call1 = null;
	Call call2 = null;
	Call call3 = null;
	Call call4 = null;
	
	@Before
	public void setUp() {
		server = new AkkaServer();
		client1 = new CallReceiver();
		client2 = new CallReceiver();
		
		call1 = new Call(SAMPLE_CALL_ID_1);
		call2 = new Call(SAMPLE_CALL_ID_2);
		call3 = new Call(SAMPLE_CALL_ID_3);
		call4 = new Call(SAMPLE_CALL_ID_4);
	}
	
	@Test
	public void testRegisterCall() {
		server.registerClient(client1);
		server.registerClient(client2);
		
		server.registerCall(call1);
		server.registerCall(call2);
		server.registerCall(call3);
		server.registerCall(call4);
		
		assertThat(server.search(SAMPLE_CALL_ID_1), is(call1));
	}
}
