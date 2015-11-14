package com.di.approval.controller;

import java.util.*;
import com.di.crm.Validate;

public class ApprovalValidateManager  {
	private List<Validate> validateList = null;
	
	public ApprovalValidateManager() {
		this.init();
	}
	
	private void init() {
		validateList = new LinkedList<Validate>();
		validateList.add(new ApprovalValidateImpl());
	}
	
	public boolean execute() {
		for(Validate validate : validateList) {
			if (!validate.execute()) {
				throw new RuntimeException("Approval Validate fail!!");
			}
		}
		return true;
	}
}
