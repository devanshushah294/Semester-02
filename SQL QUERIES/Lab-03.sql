/*
Create following table using query according to the definition.

Student
Column_Name		DataType
Enrollment_No	VARCHAR(20)
Name			VARCHAR(25)
CPI				DECIMAL(5,2)
Birthdate		DATETIME

*/

/*	From the above given table perform the following queries using ALTER statement:		*/

--1. Add two more columns City VARCHAR (20) NULL and Backlog INT NOT NULL.
ALTER TABLE Student ADD City VARCHAR(20),Backlog INT

--2. Change the size of NAME column of student from VARCHAR (25) to VARCHAR (35).
ALTER TABLE Student ALTER COLUMN Name VARCHAR(35)

--3. Change the data type DECIMAL to INT in CPI Column.
ALTER TABLE Student ALTER COLUMN Cpi INT

--4. Rename Column Enrollment No to ENO.
Sp_rename 'student.enrollmentno', 'eno', 'column'

--5. Delete Column City from the STUDENT table.
ALTER TABLE Student DROP COLUMN City

--6. Change name of table STUDENT to STUDENT_MASTER.
Sp_rename 'student', 'student_master'

--7. Remove Column Backlog from the table.
ALTER TABLE Student DROP COLUMN Backlog

--8. Change Constraint of Name Column from NULL to NOT NULL.
ALTER TABLE Student ALTER COLUMN Name Varchar(25) NOT NULL

--9. Rename Column Birthdate to BDate.
Sp_rename 'student.Birthdate', 'BDate', 'column'

--10. Change the datatype of ENO Column from VARCHAR (20) to VARCHAR (12)
ALTER TABLE Student ALTER COLUMN ENO VARCHAR(12)