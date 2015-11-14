package com.di.crm.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import com.di.util.ReadProperties;

public class TestUtilProperties {
	private final String PROP_URL = ""; 
	ReadProperties prop = null;
	
	@Before
	public void setUp() throws MalformedURLException {
		prop = new ReadProperties(new URL(PROP_URL));
	}
	
	@Test
	public void testReadProperties() {
		
	}
}
