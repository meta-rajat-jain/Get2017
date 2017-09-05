insert into members(member_nm,addressline1,addressline2,category) values ("Rajat","kirti nagar","jpr","A");
insert into members(member_nm,addressline1,addressline2,category) values ("Jain","tonk road","jaipr","B");
insert into members(member_nm, addressline1, addressline2, category) values("Raj", "Sector-6", "Sanganer", "F");
insert into members(member_nm, addressline1, addressline2, category) values( "Raja", "Sector-13", "Pratap Nagar", "F");
insert into members(member_nm, addressline1, addressline2, category) values( "Raa", "Sector-2", "Choti Chopad", "F");

insert into subjects(subject_nm) values ("Computer");
insert into subjects(subject_nm) values ("Science");
insert into subjects(subject_nm) values ("C++ Programming");
insert into subjects(subject_nm) values("Oracle");
insert into subjects(subject_nm) values("JavaScript");
insert into subjects(subject_nm) values("JAVA");

insert into publisher(publisher_nm) values ("TMH");
insert into publisher(publisher_nm) values ("Tata");
insert into publisher(publisher_nm) values("Arihant Publications");
insert into publisher(publisher_nm) values("Taxmann Publications");
insert into publisher(publisher_nm) values("Genius Publications");


insert into authors(author_nm) values ("Herbert schildt");
insert into authors(author_nm) values ("E.Balaguruswami");
insert into authors(author_nm) values("James Gosling");
insert into authors(author_nm) values("Danielle Steel");
insert into authors(author_nm) values("William Shakespeare");

insert into titles(title_nm,subject_id,publisher_id) values ("Programming Fundamentals Java","1","1");
insert into titles(title_nm,subject_id,publisher_id) values ("Programming Fundamentals C++","2","2");
insert into titles(title_nm, subject_id,publisher_id) values("Earth Facts",  "3", "3");
insert into titles(title_nm, subject_id,publisher_id) values("Know Database Management", "4", "4");
insert into titles(title_nm, subject_id,publisher_id) values("JAVA - Basics", "5", "5");


insert into books(title_id,price,status) values ("1","125.00","not avilable");
insert into books(title_id,price,status) values ("2","132.00","available");
insert into books(title_id,price, status) values("3","215.00", "available");
insert into books(title_id,price, status) values("4","510.00", "available");
insert into books(title_id,price, status) values("5","220.00", "available");

insert into title_author(title_id,author_id) values ("1","1");
insert into title_author(title_id,author_id) values ("2","2");
insert into title_author(title_id, author_id) values("3", "3");
insert into title_author(title_id, author_id) values("4", "4");
insert into title_author(title_id, author_id) values("5", "5");

insert into book_issue(accession_no,member_id) values ("1","1");
insert into book_issue(accession_no,member_id) values ("2","2");
insert into book_issue(accession_no,member_id) values ("3","3");
insert into book_issue(accession_no,member_id) values ("4","4");
insert into book_issue(accession_no,member_id) values ("5","5");


insert into book_return(accession_no,member_id, issue_dt) SELECT accession_no, member_id, issue_dt FROM book_issue where member_id = '1' and accession_no = '1';
insert into book_return(accession_no,member_id, issue_dt) SELECT accession_no, member_id, issue_dt FROM book_issue where member_id = '2' and accession_no = '2';
insert into book_return(accession_no,member_id, issue_dt) SELECT accession_no, member_id, issue_dt FROM book_issue where member_id = '3' and accession_no = '3';
insert into book_return(accession_no,member_id, issue_dt) SELECT accession_no, member_id, issue_dt FROM book_issue where member_id = '4' and accession_no = '4';
insert into book_return(accession_no,member_id, issue_dt) SELECT accession_no, member_id, issue_dt FROM book_issue where member_id = '5' and accession_no = '5';



UPDATE members SET addressline2 = "jaipur"
where category = "A" or "B";

UPDATE members SET addressline1 = "EPIP, Sitapura" where category="F";
/*
DELETE FROM PUBLISHER;

ALTER TABLE titles AUTO_INCREMENT = 1;
ALTER TABLE publisher AUTO_INCREMENT = 1;

SET @publisher_nm1 = 'New Moon Books';
SET @publisher_nm2 = 'Binnet & Harley';

INSERT INTO publisher(publisher_nm) VALUES (@publisher_nm1), (@publisher_nm2);

insert into titles(title_nm,subject_id,publisher_id) values ("Programming Fundamentals Java","1","1");
insert into titles(title_nm,subject_id,publisher_id) values ("Programming Fundamentals C++","2","2");



insert into books(title_id,price,status) values ("1","125.00","not avilable");
insert into books(title_id,price,status) values ("2","132.00","available");

insert into title_author(title_id,author_id) values ("1","1");
insert into title_author(title_id,author_id) values ("2","2");

DELETE FROM titles where publisher_id ="1";*/