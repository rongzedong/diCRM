package com.di.util.rest;

import java.sql.Blob;
import java.sql.Connection;

import javax.sql.DataSource;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.springframework.beans.factory.annotation.Autowired;

public class BlobXmlAdapter extends XmlAdapter<String, Blob>{

	@Autowired
	DataSource dataSource;
	
	@Override
	public Blob unmarshal(String v) throws Exception {
		if (v == null) v = "";
		Connection connection = dataSource.getConnection();
		if (connection == null) {
			throw new NullPointerException("DataSource Connection is null");
		}
		return connection.createBlob();
	}

	@Override
	public String marshal(Blob v) throws Exception {
		if (v == null) {
			throw new NullPointerException("Marshalling is fail : parameter is null.");
		}
		return v.getBytes(0, (int)v.length()).toString();
	}
}
