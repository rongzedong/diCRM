package com.di.akka;

import java.util.*;

import com.di.crm.callcenter.CallReceiver;
import com.di.crm.callcenter.domain.Call;

public class AkkaServer {
	
	private List<CallReceiver> callReceiverList;
	
	public AkkaServer() {
		builder();
	}
	
	private void builder() {
		this.callReceiverList = new LinkedList<CallReceiver>();
	}
	
	private CallReceiver selectReceiver() {
		//TODO : 가지고 있는 listener중 어떻게 하면 thread-safe하게 
		// call에 등록&관리??
		return this.callReceiverList.get(0);	
	}
	
	public void registerCall(Call call) {
		CallReceiver receiver = selectReceiver();
		receiver.registerCall(call);
	}
	
	public void registerClient(CallReceiver callReceiver) {
		callReceiverList.add(callReceiver);
	}
	
	public Call search(String callId) {
		Call searchCall = null;
		for(CallReceiver receiver : callReceiverList) {
			searchCall = receiver.search(callId);
			if (searchCall != null) {
				return searchCall;
			}
		}
		return searchCall;
	}
}
