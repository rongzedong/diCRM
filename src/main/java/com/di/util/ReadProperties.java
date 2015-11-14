package com.di.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

public class ReadProperties {

	private Properties properties = null;
	private URL url = null;
	
	public ReadProperties(URL url) {
		init(url);
	}
	
	private void init(URL url) {
		this.url = url;
		
		Properties properties = new Properties();

	    try {
	      properties.load(new FileInputStream(this.url.getPath()));
	    } catch (IOException e) {
	    	throw new RuntimeException(e.getMessage());
	    }
	}
	
	public Map<String, String> readProperty(Map<String, String> keyMap) {
	    
	    for(Map.Entry<String, String> entry : keyMap.entrySet()) {
	    	entry.setValue(properties.get(entry.getKey()).toString());
	    }
	    
	    return keyMap;
	}
}
