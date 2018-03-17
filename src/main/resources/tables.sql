CREATE TABLE OrderDetail (
  id  integer NOT NULL AUTO_INCREMENT,
  AMOUNT varchar(20),
  PRODUCT_COUNT varchar(20),
  PRODUCT_NAME varchar(20),
  PRODUCT_PRICE varchar(20),
  PRODUCT_UNIT varchar(20),
  ORDER_ID varchar(20),
  primary key (id)
);


CREATE TABLE OrderId (
  id varchar(20) not null,
  ORDER_ID varchar(20),
  STATUS tinyint,
  primary key (id)
);


CREATE TABLE Product (
  id  integer NOT NULL AUTO_INCREMENT,
  NAME varchar(20),
  PRICE varchar(20),
  UNIT varchar(20),
  primary key (id)
);


CREATE TABLE ProductOrder (
  ORDER_ID varchar(20) not null,
  CUSTOMER_NAME varchar(20),
  CUSTOMER_PHONE varchar(20),
  DELIVER_STATUS tinyint,
  DELIVER_TIME varchar(20),
  ORDER_TIME varchar(20),
  PAY_STATUS tinyint,
  PRINT_STATUS tinyint,
  TOTAL_COUNT varchar(20),
  TOTAL_PRICE varchar(20),
  primary key (ORDER_ID)
);



CREATE TABLE Unit (
  id  integer NOT NULL AUTO_INCREMENT,
  NAME varchar(20),
  primary key (id)
);