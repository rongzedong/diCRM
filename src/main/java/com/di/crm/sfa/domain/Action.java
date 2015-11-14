package com.di.crm.sfa.domain;

import java.sql.Blob;
import java.util.Date;
import java.util.List;

import com.di.hr.domain.Employee;
import com.di.util.Code.*;

public class Action {
	private String rowId;
	
	private String actionRowId;
	private String name;
	
	private String clientRowId;
	private String clientName;	//prospect
	
	private String relatedProjectRowId;
	
	private Blob contents;
	private Date startDate;
	private Date endDate;
	private ActionStatus status;
	
	private String salesPersonRowId;
	private String managerRowId;
	
	private ActionBigClass bigClassType;
	private ActionMiddleClass middleClassType;
	private ActionSubClass subClassType;
	
	private List<String> attachFilesRowIds;
	private AlarmFlag alarmFlag;
	
	private Date lastUpdated;
	private Date createDated;
}
