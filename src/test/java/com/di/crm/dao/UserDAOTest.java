package com.di.crm.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.di.crm.dao.UserDAO;
import com.di.crm.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class UserDAOTest {

	@Inject
	private UserDAO dao;
	
	// test data information
	private User user = null;
	private String id = "test001";
	private String password = "1q2w3e4r";
	
	@Before
	public void testBefore() {
		user = new User();
		
		user.setRowid("1-AXSJ2");
		user.setId(id);
		user.setFirstname("Dennis");
		user.setLastname("Hyun");
		user.setPassword(password);
		user.setCreatedby("test001");
		user.setUpdatedby("test001");
	}
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertUser() throws Exception {
		dao.insertUser(user);
		if (dao.getUser(id) != null)
			dao.deleteUser(id);
	}
	
	@Test
	public void testSearchUser() throws Exception {
		if (dao.getUser(id) == null)
			dao.insertUser(user);
		User testUser = dao.getUserWithPW(id, password);
		System.out.println("[testSearchUser]" + testUser.toString());
		
		assertNotNull(testUser);
		assertEquals(testUser.getId(), id);
		if (dao.getUserWithPW(id, password) != null)
			dao.deleteUser(id);
	}
	
	@Test
	public void testFailWithUnmatchedPW() throws Exception {
		if (dao.getUser(id) == null)
			dao.insertUser(user);
		
		user.setPassword("notMatched!");
		assertNull(dao.getUserWithPW(user.getId(), user.getPassword()));
	}
}