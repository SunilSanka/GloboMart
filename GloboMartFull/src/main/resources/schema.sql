;              
   

CREATE CACHED TABLE PRODUCT(
    ID LONG NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255),
    PRODUCT_CODE VARCHAR(255),
 	DESCRIPTION VARCHAR(255),
	MANUFACTURER VARCHAR(255),
	IMAGE_URL VARCHAR(255),
	MANUFACTURE_DATE DATE,
	EXPIRY_DATE VARCHAR(255),
	PRICE INT,
	PRODUCT_TYPE_ID BIGINT,
);     
ALTER TABLE PRODUCT ADD CONSTRAINT PUBLIC.CONSTRAINT_1 PRIMARY KEY(ID);

CREATE CACHED TABLE PRODUCT_TYPE(
    ID LONG NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(255),
);     
ALTER TABLE PRODUCT_TYPE ADD CONSTRAINT PUBLIC.CONSTRAINT_2 PRIMARY KEY(ID);

CREATE CACHED TABLE INVENTORY(
    ID LONG NOT NULL AUTO_INCREMENT,
    IS_ACTIVE BOOLEAN,
    LOCATION VARCHAR(255),
  	
);     
ALTER TABLE INVENTORY ADD CONSTRAINT PUBLIC.CONSTRAINT_3 PRIMARY KEY(ID);

CREATE CACHED TABLE INVENTORY_PRODUCT(
	INVENTORY_ID BIGINT,	
	PRODUCT_ID BIGINT
);     

CREATE CACHED TABLE PRODUCT_INVENTORY(
	PRODUCT_ID BIGINT,
	INVENTORY_ID BIGINT
);  

CREATE CACHED TABLE CUSTOMER_ORDER(
    ID LONG NOT NULL AUTO_INCREMENT,
  	ORDER_ID LONG,
    ORDER_DATE DATE,
	TOTAL_PRICE VARCHAR(255),
	STATUS VARCHAR(255),
	PAYMENT_MODE VARCHAR(255),
	PAYMENT_STATUS VARCHAR(255),
	DELIVERY_ID BIGINT,
);     
ALTER TABLE CUSTOMER_ORDER ADD CONSTRAINT PUBLIC.CONSTRAINT_8 PRIMARY KEY(ID);

CREATE CACHED TABLE PRODUCT_ORDER(
	PRODUCT_ID BIGINT,	
	ORDER_ID BIGINT
);     

CREATE CACHED TABLE ORDER_PRODUCT(
	ORDER_ID BIGINT,
	PRODUCT_ID BIGINT	
);  

CREATE CACHED TABLE DELIVERY(
    ID LONG NOT NULL AUTO_INCREMENT,
    DELIVERY_DATE DATE,
  	ADDRESS VARCHAR(255),
  	DELIVERY_STATUS VARCHAR(255),
  	DELIVERY_TYPE VARCHAR(255),
);     
ALTER TABLE DELIVERY ADD CONSTRAINT PUBLIC.CONSTRAINT_9 PRIMARY KEY(ID);



