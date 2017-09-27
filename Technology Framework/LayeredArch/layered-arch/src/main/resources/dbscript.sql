create database get_testdb;


use get_testdb;

create TABLE User (
  id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(25),
   price INT,
   source VARCHAR(10),
 
);

   
INSERT INTO `get_testdb`.`user` (`name`, `PRICE`, `SOURCE`) VALUES ('p', '1', 'admin');
INSERT INTO `get_testdb`.`user` (`name`, `PRICE`, `SOURCE`) VALUES ('raj', '2300', 'admin');


