DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE (
	rowid 			VARCHAR(16) NOT NULL,
	empid 			VARCHAR(16) NOT NULL,
	depcd			VARCHAR(15),
	cmpid			VARCHAR(15),
	poscd			VARCHAR(15),
	korname			VARCHAR(200),
	engname			VARCHAR(200),
	gender			VARCHAR(15),
	address			VARCHAR(254),
	phone			VARCHAR(30),
	createdby 		VARCHAR(16) NOT NULL,
	createddate 	DATETIME	NOT NULL,
	modifiedby		VARCHAR(16),
	modifieddate 	DATETIME,

	CONSTRAINT pk_Approvalline PRIMARY KEY (rowid, empid)
)  ENGINE=INNODB DEFAULT CHARSET = UTF8 COMMENT='EMPLOYEE Master';

COMMIT;