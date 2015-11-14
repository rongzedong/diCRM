package com.di.crm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.di.crm.domain.User;
import com.di.crm.domain.UserExample;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"com.di.crm.mapper.UserMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public User getUser(String id) {
		return (User)sqlSession.selectOne(namespace + ".getUser", id);
	}

	@Override
	public void insertUser(User user) {
		sqlSession.insert(namespace + ".insertUser", user);
	}

	@Override
	public User getUserWithPW(String id, String password) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("id", id);
		paramMap.put("password", password);
		return sqlSession.selectOne(namespace + ".getUserWithPW", paramMap);
	}

	@Override
	public int deleteUser(String id) {
		return sqlSession.delete(namespace + ".deleteUser", id);
	}

	@Override
	public int updateUser(User user) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		
		return sqlSession.delete(namespace + ".deleteUser", paramMap);
		
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
