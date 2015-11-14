package com.di.crm.sfa.domain;

import java.util.Date;
import java.util.List;

import com.di.hr.domain.Employee;
import com.di.util.AttachFile;

public class Bid {
	private String rowId;
	
	private String bidId;
	private String name;
	
	private String salesPersonRowId;
	private String managerRowId;
	
	private List<String> actionRowIds;
	private List<AttachFile> attachFiles;
	
	private Date lastUpdated;
	private Date createDated;
}
