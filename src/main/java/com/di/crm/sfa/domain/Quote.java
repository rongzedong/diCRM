package com.di.crm.sfa.domain;

import java.sql.Blob;
import java.util.*;

import com.di.hr.domain.Employee;
import com.di.util.AttachFile;

/**
 * Only register Quote result and related actions
 * (CRM is not QUOTE management system!!!)
 * 
 * @author hyun
 *
 */
public class Quote {
	private String rowId;
	
	private String name;
	private Blob content;
	
	private List<String> actionRowIds;
	private List<String> quoteProductRowIds;
	
	private List<AttachFile> attachFiles;
	
	private String salesPersonRowId;
	private String managerRowId;
	
	private Date lastUpdated;
	private Date createDated;
	
	public Quote() {
		
	}
	
	public void deleteProducts(int seq) {

	}
	
	public void addProducts(Product product) {
		
	}
}
