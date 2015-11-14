package com.di.util;

import java.util.Date;
import java.sql.*;

public class AttachFile {
	public String rowId;
	public String refereceRowId;
	
	public String ownerId;
	public String modifierId;
	
	public String fullPath;
	public Blob file;
	
	public Date createdDate;
	public Date modifiedDate;
}
