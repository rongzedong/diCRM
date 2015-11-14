package com.di.engine.dao;

import com.di.engine.domain.Opportunity;

public interface OpportunityDAO {
	public int create(Opportunity opportunity);
	public int update(Opportunity opportunity);
	public int delete(String rowId); 
}
