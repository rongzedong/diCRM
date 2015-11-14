package com.di.crm.util.mybatis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class GenerateResultMap {
	public Map<String, String> getFieldNameFromClass(String className) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Map<String, String> fieldMap = null;
		
		Class<?> destClass = Class.forName(className);
		Constructor<?> constructor = destClass.getConstructor();
		
		Object instanceClass = constructor.newInstance();
		Field[] fieldArray = instanceClass.getClass().getDeclaredFields();
		
		fieldMap = new HashMap<String, String>();
		for(Field field : fieldArray) {
			
			String fieldType = field.getType().getTypeName();
			if ("int".equals(fieldType)) {
				fieldType = "INTEGER";
			} else if ("java.lang.String".equals(fieldType)) {
				fieldType = "VARCHAR";
			} else if ("java.util.Date".equals(fieldType)) {
				fieldType = "DATE";
			} else {
				continue;
			}
			
			fieldMap.put(field.getName(), fieldType);
		}
		return fieldMap;
	}
	
	public String makeFieldWithComma(String className) {
		String result = "";
		Map<String, String> fieldMap = null;
		
		try {
			fieldMap = getFieldNameFromClass(className);
			if (fieldMap == null) return result;
		} catch (ClassNotFoundException | NoSuchMethodException
				| SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String key : fieldMap.keySet()) {
			result += key + ",";
		}
		result = result.substring(0, result.length() - 1);	// 마지막 comma 제외
		return result;
	}
	
	public String makeResultMap(String className) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String result = "";
		
		Map<String, String> fieldMap = getFieldNameFromClass(className); 
		
		result = makeResultMapHeader(className);
		result += makeResultMapId();
		result += makeResultMapColumns(fieldMap);
		result += makeResultMapTail();
		
		return result;
	}
	
	private String makeResultMapHeader(String className) {
		return  "<resultMap id=\"BaseResultMap\" type=\""+ className + "\">\n";
	}
	
	private String makeResultMapId() {
		return "<id column=\"rowid\" property=\"rowid\" jdbcType=\"VARCHAR\" />\n";
	}
	
	private String makeResultMapTail() {
		return "</resultMap>";
	}
	
	private String makeResultMapColumns(Map<String, String> fieldMap) {
		String value = "";
		String result = "";
		
		for(String key : fieldMap.keySet()) {
			value = fieldMap.get(key);
			result += "<result column=\"" + key + "\" property=\"" + key + "\" jdbcType=\"" + value + "\" />\n";
		}
		return result;
	}
}