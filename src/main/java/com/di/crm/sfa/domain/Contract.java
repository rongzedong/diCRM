package com.di.crm.sfa.domain;

import java.util.Date;
import java.util.List;

public class Contract {
	private String rowId;
	
	private String salesPersonRowId;
	private String managerRowId;
	
	private List<String> actionRowIds;
	private List<String> attachFilesRowIds;
	
	private Date lastUpdated;
	private Date createDated;
	
}
