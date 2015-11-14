CREATE TABLE APPROVAL (
	rowid 			VARCHAR(16) NOT NULL,
	appid 			VARCHAR(16) NOT NULL,
	subject 		VARCHAR(255),
	content 		BLOB,
	delflg		    BOOLEAN,
	createdby 		VARCHAR(16),
	modifiedby		VARCHAR(16),
	createddate 	DATETIME,
	modifieddate 	DATETIME,

	CONSTRAINT pk_Approval PRIMARY KEY (rowid, appid)
);

CREATE TABLE APPROVAL_LINE (
	rowid 			VARCHAR(16) NOT NULL,
	appid 			VARCHAR(16) NOT NULL,
	seq				INT			NOT NULL,
	linetype		VARCHAR(15)	NOT NULL,
	empno			VARCHAR(16),
	delflg		    BOOLEAN		NOT NULL,
	createdby 		VARCHAR(16) NOT NULL,
	createddate 	DATETIME,
	modifiedby		VARCHAR(16),
	modifieddate 	DATETIME,

	CONSTRAINT pk_Approvalline PRIMARY KEY (rowid),
);