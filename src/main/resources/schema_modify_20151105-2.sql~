CREATE TABLE customer (
	rowid 			VARCHAR(16) NOT NULL,
	customerid		VARCHAR(16) NOT NULL,
	firstname		VARCHAR(50),
	lastname		VARCHAR(50),
	companyname		VARCHAR(100),
	corpregnumber	VARCHAR(30),
	type			VARCHAR(30),
	status			VARCHAR(30),
	grade			VARCHAR(30),
	addressid		VARCHAR(16),
	phonenumber		VARCHAR(50),
	email			VARCHAR(30),
	createdby 		VARCHAR(16) NOT NULL,
	modifiedby		VARCHAR(16) NOT NULL,
	createddate 	DATETIME	NOT NULL,
	modifieddate 	DATETIME	NOT NULL,

	CONSTRAINT pk_customer PRIMARY KEY (rowid, customerid)
) ENGINE=INNODB DEFAULT CHARSET = UTF8 COMMENT='customer';

CREATE INDEX par_customer_rowid ON customer (rowid);

commit;
