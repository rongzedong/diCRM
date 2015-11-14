package com.di.crm.sfa.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.di.crm.sfa.domain.Action;
import com.di.crm.sfa.service.ActionService;
import com.di.crm.sfa.service.ActionServiceImpl;

public class ActionControllerImpl implements ActionController {
	private final int MAX_RETRIVE_COUNT = 200;
	
	@Autowired
	public ActionService actionService;
	
	public List<Action> getActionListPaging(List<String> actionRowIdList,
											int start, int end) {
	    return actionService.searchPaging(actionRowIdList, start, end);
	}
	
	public List<Action> getActionListAll(List<String> actionRowIdList) {
		if (actionRowIdList.size() > MAX_RETRIVE_COUNT) 
			throw new RuntimeException("한번에 조회가능한 회수를 초과하였습니다.");
		
		List<Action> actionObjLists = new LinkedList<Action>();
	    Action action = null;
	    for(String id : actionRowIdList) {
	        action = actionService.search(id);
	        if (action != null)
	        	actionObjLists.add(action);
	    }
	   return actionObjLists;
	}
}
