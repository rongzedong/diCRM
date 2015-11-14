package com.di.crm.dao;

import java.util.List;

import com.di.crm.domain.User;
import com.di.crm.domain.UserExample;

public interface UserDAO {
	public String getTime();
	public User getUser(String id) throws Exception;
	public User getUserWithPW(String id, String password) throws Exception;
	public void insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(String id);
	
	List<User> selectByExample(UserExample example);
	User selectByPrimaryKey(String id);
}
