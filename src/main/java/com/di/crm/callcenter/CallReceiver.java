package com.di.crm.callcenter;

import java.util.*;

import com.di.crm.callcenter.domain.Call;

public class CallReceiver {

	private List<Call> callList = null;
	
	public CallReceiver() {
		init();
	}
	
	private void init() {
		this.callList = new LinkedList<Call>();
	}
	
	public void registerCall(Call call) {
		callList.add(call);
	}
	
	public Call search(String callId) {
		Call findCall = null;
		for(Call call : callList) {
			if (callId.equals(call.getCallId())) {
				return call;
			}
		}
		
		return findCall;
	}
}
