Use Devanshu
create table Student
(
	RNo int primary key,
	Name varchar(50),
	Branch varchar(50),
	Spi decimal(4,2),
	Bklog int
)

insert into student values(101,'raju','ce','8.80',0)
insert into student values(102,'amit','ce','2.20',3)
insert into student values(103,'sanjay','me','1.50',6)
insert into student values(104,'neha','ec','7.65',1)
insert into student values(105,'meera','ee','5.52',2)
insert into student values(106,'mahesh','ec','4.50',3)

--1. Create a view Personal with all columns.
	CREATE VIEW Personal
	AS
	SELECT * FROM Student

--2. Create a view Student_Details having columns Name, Branch & SPI.
	CREATE VIEW Student_Details
	AS
	SELECT Name,Branch,SPI
	FROM Student

3. Create a view Academic having columns RNo, Name, Branch.
	CREATE VIEW Academic
	AS
	SELECT RNo, Name, Branch
	FROM Student
	Select * from Academic

--4. Create a view Student_Data having all columns but students whose bklog more than 2.
	CREATE VIEW Student_Data
	AS
	SELECT * FROM Student
	WHERE Bklog > 2

--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
	CREATE VIEW Student_Pattern
	AS
	SELECT RNo, Name, Branch
	FROM Student
	WHERE Name Like '____'

--6. Insert a new record to Academic view. (107, Meet, ME)
	INSERT INTO Academic
	SELECT 107, 'Meet', 'ME'
	OR
	INSERT INTO Academic
	Values (107, 'Meet', 'ME')

--7. Update the branch of Amit FROM CE to ME in Student_Details view.
	UPDATE Student_Details
	SET Branch='ME'
	WHERE Name='Amit' And Branch='CE'

--8. Delete a student whose roll number is 104 FROM Academic view.
	DELETE FROM Academic
	WHERE RNo=104

--9. Create a view that displays information of all students whose spi is above 9.5.
	CREATE VIEW [vwSPIAbove9.5]
	AS
	SELECT * FROM Student WHERE SPI>9.5

--10. Create a view that displays 0 backlog students.
	CREATE VIEW [vwZeroBklog]
	AS
	SELECT * FROM Student WHERE Bklog=0