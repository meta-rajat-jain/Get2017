DROP DATABASE IF EXISTS lis;
create database LIS;

use lis;

CREATE TABLE members (
member_id int NOT NULL AUTO_INCREMENT,
member_nm varchar(20),
addressline1 varchar(45),
addressline2 varchar(45),
category varchar(20),
PRIMARY KEY(member_id)
);

CREATE TABLE subjects (
subject_id int NOT NULL AUTO_INCREMENT,
subject_nm varchar(20),
PRIMARY KEY(subject_id)
);

CREATE TABLE publisher (
publisher_id int NOT NULL AUTO_INCREMENT,
publisher_nm varchar(20),
PRIMARY KEY(publisher_id)
);

CREATE TABLE authors (
author_id int NOT NULL AUTO_INCREMENT,
author_nm varchar(20),
PRIMARY KEY(author_id)
);

CREATE TABLE titles (
title_id int NOT NULL AUTO_INCREMENT,
title_nm varchar(40),
subject_id int,
publisher_id int,
PRIMARY KEY(title_id),
FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE title_author (
title_id int,
author_id int,
PRIMARY KEY(title_id,author_id),
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (author_id) REFERENCES authors(author_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE books (
accession_no int NOT NULL AUTO_INCREMENT,
purchase_dt timestamp,
price double,
status varchar(20),
title_id int,
PRIMARY KEY(accession_no),
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE book_issue (
accession_no int,
issue_dt timestamp,
member_id int,
due_dt timestamp,
PRIMARY KEY(issue_dt,accession_no,member_id),
FOREIGN KEY(member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE book_return (
accession_no int,
issue_dt timestamp,
member_id int,
return_dt timestamp,
PRIMARY KEY(return_dt,accession_no,member_id),
FOREIGN KEY(member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE
);


show tables;

Alter table book_issue drop FOREIGN KEY book_issue_ibfk_1;

Alter table book_return drop FOREIGN KEY book_return_ibfk_1;

drop table members;

CREATE TABLE members (
member_id int NOT NULL AUTO_INCREMENT,
member_nm varchar(20),
addressline1 varchar(45),
addressline2 varchar(45),
category varchar(20),
PRIMARY KEY(member_id)
);


ALTER TABLE book_issue
ADD FOREIGN KEY (member_id) REFERENCES members(member_id);


ALTER TABLE book_return
ADD FOREIGN KEY (member_id) REFERENCES members(member_id);

select now();

Alter TABLE book_issue
MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;

Alter TABLE book_return
MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT 0;

Alter TABLE book_return
MODIFY COLUMN return_dt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;


DELIMITER $$
CREATE TRIGGER dt_15days
BEFORE INSERT ON `book_issue` FOR EACH ROW
BEGIN
  SET NEW.due_dt = now() + INTERVAL 15 DAY;
END;
$$
DELIMITER ;



