CREATE TABLE address (
	rowid 			VARCHAR(16) NOT NULL,
	customerid 		VARCHAR(16),
	postnumber		VARCHAR(30),
	province		VARCHAR(50),
	city			VARCHAR(30),
	detailAddress	VARCHAR(200),
	createdby 		VARCHAR(16) NOT NULL,
	modifiedby		VARCHAR(16) NOT NULL,
	createddate 	DATETIME	NOT NULL,
	modifieddate 	DATETIME	NOT NULL,

	CONSTRAINT pk_address PRIMARY KEY (rowid),
	CONSTRAINT fk_address_custid FOREIGN KEY (customerid) REFERENCES customer(id)
) ENGINE=INNODB DEFAULT CHARSET = UTF8 COMMENT='address'
;


--DROP TRIGGER IF EXISTS approval_OnInsert;
--DROP TABLE IF EXISTS address;

CREATE TABLE address (
	rowid 			VARCHAR(16) NOT NULL,
	customerid 		VARCHAR(16),
	postnumber		VARCHAR(30),
	province		VARCHAR(50),
	city			VARCHAR(30),
	detailAddress	VARCHAR(200),
	createdby 		VARCHAR(16) NOT NULL,
	modifiedby		VARCHAR(16) NOT NULL,
	createddate 	DATETIME	NOT NULL,
	modifieddate 	DATETIME	NOT NULL,

	CONSTRAINT pk_address PRIMARY KEY (rowid),
	FOREIGN KEY (customerid) REFERENCES customer (id)
) ENGINE=INNODB DEFAULT CHARSET = UTF8 COMMENT='address';


--CREATE INDEX par_address_rowid ON address (rowid);

--CREATE
--    TRIGGER address_OnInsert BEFORE INSERT
--            ON address FOR EACH ROW
--    SET
--        NEW.createddate = NOW()
--;


--commit;

