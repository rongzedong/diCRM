package com.di.crm.sfa.service;

import java.util.List;

import com.di.crm.sfa.domain.Action;

public interface ActionService {
	public Action search(String rowId);
	public List<Action> searchPaging(List<String> actionRowIds, int start, int end);
}
