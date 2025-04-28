CREATE DATABASE db1;
USE db1;
CREATE TABLE tb1
 (StudentID VARCHAR(11),
FullName VARCHAR(50),
University VARCHAR(20),
CONSTRAINT PKSTUDENT PRIMARY KEY (StudentID)
 ) ;
Insert into tb1 values ('66130500029','Nuttanicha Aukaworawit','KMUTT');