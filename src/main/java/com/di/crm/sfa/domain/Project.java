package com.di.crm.sfa.domain;

import java.util.*;

import com.di.crm.sfa.service.*;
import com.di.util.*;
import com.di.util.Code.*;

public class Project {

	private String rowId;
	
	private String projectId;
	private String name;
	
	private String salesPersonRowId;
	private String managerRowId;
	
	private Double totalAmount;
	
	private List<String> actionRowIds;
	private List<String> quotesRowIds;
	private List<String> bidRowIds;
	private List<String> contractRowIds;
	
	private ProjectStatus status;
	private ProjectType type;
	
	private Date startDate;
	private Date endDate;
	
	private List<AttachFile> attachFiles;
	
	private Date lastUpdated;
	private Date createDated;
	
}
