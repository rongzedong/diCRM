package com.di.crm.util.mybatis;

import java.lang.reflect.InvocationTargetException;

public class GenerateMapperXml {

	public String makeMapperXml(String namespace, String className) {
		String result = "";
		
		result = makeMapperHeader(namespace);
		result += makeMapperResultMap(className);
		result += makeSqlWhere("mapperxml.properties");
		result += makeSqlBaseColumn(className);
		result += makeMapperTail();
		
		return result;
	}
	
	public String makeMapperHeader(String namespace) {
		String header = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" 
				+ "<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" >\n"
				+ "<mapper namespace=\"" + namespace + "\" >\n";
		return header;
	}
	
	public String makeMapperResultMap(String className) {
		String result = "";
		GenerateResultMap resultMap = new GenerateResultMap();
		
		try {
			result = resultMap.makeResultMap(className);
		} catch (ClassNotFoundException | NoSuchMethodException
				| SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	public String makeSqlWhere(String propFileName) {
		String result = "";
		
		// TODO : properties 화일에서 read
		result = "<sql/>\n";
		return result;
	}
	
	public String makeSqlBaseColumn(String className) {
		String result = "";
		
		GenerateResultMap resultMap = new GenerateResultMap();
		
		result = "<sql id=\"Base_Column_List\">\n";
		result += resultMap.makeFieldWithComma(className);
		result += "</sql>\n"; 
		return result;
	}
	
	public String makeMapperTail() {
		return "</mapper>";
	}
}
