package com.di.util;

public class Code {
	
	//Approval line
	static public enum LineType { APPROVAL, REFERENCE, SECRET_REF, NOTIFICATION, CORPORATION };
	
	//Approval type
	static public enum Type { NORMAL, URGENT, ARBITRARY_MANAGER };
	
	//Approve status per line
	static public enum ApproveLineResult { APPROVAL, DENY, PENDING, READY };
	
	//Approve result
	//If approval register and start approval successfully, the status is 'ONGOING'
	static public enum ApproveResult { CREATING, APPROVAL, ONGOING, DENY, RETRY };
	
	//Customer
	static public enum CustomerType { PRIVATE, COMPANY };
	
	
	//Employee
	static public enum EmployeeType { FULLTIME, PARTTIME, ILLREGULAR, CONTRACT };
	
	
	//Batch job - Period
	static public enum BatchPeriod { YEAR, MONTH, WEEK, DAILY, ONCE };
	
	//Batch job - status
	static public enum BatchStatus { READY, FINISH, PENDING, ERROR };
	
	
	//Project status
	static public enum ProjectStatus { READY, APPROVE, ONGOING, DONE, CANCEL };
	
	static public enum ProjectType { NORMAL, IMPORTANT };
	
	//Action
	static public enum ActionStatus { ACTIVE, RUNNING, END, CANCEL };
	
	//Action type
	static public enum ActionType { REGULAR_VISITED, SEMINAR, MEETING };
	
	//TODO : must implement the hierarchy code!!!
	
	static public enum ActionBigClass { MEETING };
	
	static public enum ActionMiddleClass { PROJECT };
	
	static public enum ActionSubClass { REGULAR, URGENT, NEGOTIATING };
	
	//general code
	static public enum AlarmFlag { NOTIFY, NOT_NOTIFY };
	
}
