package com.di.crm.util.mybatis;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GenerateResultMapTest {
	private GenerateResultMap obj = null;
	private String className = "";
	
	@Before
	public void before() {
		obj = new GenerateResultMap();
		className = "com.di.crm.domain.User";
	}
	
	@Test
	public void getClassFieldName() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Map<String, String> resultMap = obj.getFieldNameFromClass(className);
		for(String key : resultMap.keySet()) {
			System.out.println("key : " + key + ", value : " + resultMap.get(key));
		}
		assertNotNull(resultMap);
	}
	
	@Test
	public void getmakeResultMap() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String result = obj.makeResultMap(className);
		System.out.println("[getmakeResultMap] result : " + result);
		assertNotNull(result);
	}
}
