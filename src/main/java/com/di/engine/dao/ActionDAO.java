package com.di.engine.dao;

import com.di.engine.domain.Action;

public interface ActionDAO {
	public int insert(Action action);
	public int update(Action action);
	public int delete(Action action);
}
