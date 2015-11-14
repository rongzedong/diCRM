package com.di.crm.sfa.controller;

import java.util.*;

import com.di.crm.sfa.domain.Action;

public interface ActionController {
	public List<Action> getActionListPaging(List<String> actionRowIdList, 
											int start, int end);
	public List<Action> getActionListAll(List<String> actionRowIdList);
}
