CREATE DATABASE AamSysdb;
CREATE TABLE PRODUCT (
                         ID SERIAL PRIMARY KEY NOT NULL,
                         nameProduct        varchar(220) NOT NULL,
                         descriptionProduct varchar(500) NOT NULL,
                         category           varchar (200) not null,
                         quantity           INT not null,
                         price              INT not null
);