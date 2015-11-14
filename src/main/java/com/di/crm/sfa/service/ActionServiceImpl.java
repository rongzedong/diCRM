package com.di.crm.sfa.service;

import java.util.*;

import com.di.crm.sfa.domain.Action;

public class ActionServiceImpl implements ActionService {
	
	private final int MAX_ACTIONS_PAGE = 10;
	
	public List<Action> searchPaging(List<String> actionRowIds, int start, int end) {
		List<Action> searchActions = new LinkedList<Action>();
		if ((start <= 0 || end <= 0) || (end - start > MAX_ACTIONS_PAGE)) 
			return searchActions;
		
		return searchActions;
	}

	public Action search(String rowId) {

		return null;
	}
	
}
