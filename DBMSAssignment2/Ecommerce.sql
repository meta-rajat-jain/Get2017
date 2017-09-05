DROP SCHEMA IF EXISTS ECommerce;

CREATE SCHEMA ECommerce ;

use ECommerce;

CREATE TABLE  categories (
category int not null,
parentcategory int , 
type varchar(50),
PRIMARY KEY (category),
CONSTRAINT parentcategory FOREIGN KEY (parentcategory) REFERENCES categories(category)
);

insert into categories(category,type) values ("1","Mobiles & Tablets");
insert into categories(category,parentcategory,type) values ("2","1","Mobiles");
insert into categories(category,parentcategory,type) values ("3","1","Tablets");
insert into categories(category,parentcategory,type) values ("4","2","Smart Phones");
insert into categories(category,parentcategory,type) values ("5","2","Feature Phones");
insert into categories(category,parentcategory,type) values ("6","3","2G");
insert into categories(category,parentcategory,type) values ("7","3","3G");
insert into categories(category,parentcategory,type) values ("8","1","Accessories");
insert into categories(category,parentcategory,type) values ("9","1","Cases & Covers");

insert into categories(category,type) values ("10","Computers");
insert into categories(category,parentcategory,type) values ("11","10","Desktop");
insert into categories(category,parentcategory,type) values ("12","10","Laptop");
insert into categories(category,parentcategory,type) values ("13","10","Laptop Accessories");
insert into categories(category,parentcategory,type) values ("14","13","Keyboard");
insert into categories(category,parentcategory,type) values ("15","13","Mouse");
insert into categories(category,parentcategory,type) values ("16","13","Headphones");
insert into categories(category,parentcategory,type) values ("17","10","Printers");
insert into categories(category,parentcategory,type) values ("18","17","Inkjet");
insert into categories(category,parentcategory,type) values ("19","17","Laser");

insert into categories(category,type) values ("20","Home Appliances");
insert into categories(category,parentcategory,type) values ("21","20","TVs");
insert into categories(category,parentcategory,type) values ("22","21","LED");
insert into categories(category,parentcategory,type) values ("23","21","LCD");
insert into categories(category,parentcategory,type) values ("24","21","Plasma");
insert into categories(category,parentcategory,type) values ("25","20","Air Conditioners");
insert into categories(category,parentcategory,type) values ("26","20","Washing Machines");
insert into categories(category,parentcategory,type) values ("27","26","Full Automatic");
insert into categories(category,parentcategory,type) values ("28","27","Top Load");
insert into categories(category,parentcategory,type) values ("29","27","Front Load");
insert into categories(category,parentcategory,type) values ("30","26","Semi Automatic");



select c1.category,c1.type,c2.type as parent_category  from categories c1 join categories c2 on c1.parentcategory = c2.category Group BY c1.parentcategory,c1.category;

select c1.category,c1.type,c2.type from categories c1 join categories c2 on c1.parentcategory = c2.category ORDER BY c1.parentcategory;

select c1.category,c1.type,c2.type ,IFNULL(c1.parentcategory,"Top Category") as ParentCategory  from categories c1 join categories c2 on c1.parentcategory = c2.category Group BY c1.parentcategory,c1.category ORDER BY c1.parentcategory ;

select c1.category,c1.type,IFNULL(c1.parentcategory,"Top Category") as ParentCategory from categories c1  where c1.parentcategory is null;

