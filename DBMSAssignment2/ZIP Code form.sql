/* Assignment 4 */

create database FORM;

use FORM;


create table zip (
office_name varchar(45),
pincode int not null ,
region_name varchar(45),
taluk varchar(45) ,
district_name varchar(45),
state varchar(45) ,
country varchar(20),
PRIMARY KEY (pincode)
);

LOAD DATA LOCAL INFILE 'C:\\Users\\User8\\Downloads\\pincode_data.csv' INTO TABLE form.zip FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n';