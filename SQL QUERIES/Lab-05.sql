Create table Students
(
	StuID		int,
	FirstName	varchar(25),
	LastName	varchar(25),
	Website		varchar(50),
	City		varchar(25),
	Division	varchar(20)
)

insert into Students values(1011,'keyur','patel','techothenet.com','rajkot','ii-bcx');
insert into Students values(1022,'hardik','shah','digminecraft.com','ahmedabad','i-bcy');
insert into Students values(1033,'kajal','trivedi','bigactivities','baroda','iv-dcx');
insert into Students values(1044,'bhoomi','gajera','checkyourmath.com','ahmedabad','iii-dcw');
insert into Students values(1055,'harmit','mitel',null,'rajkot','ii-bcy');
insert into Students values(1066,'ashok','jani',null,'baroda','ii-bcz');

--1. Display the name of students whose name starts with ‘k’.
Select FirstName from Students Where FirstName Like 'K%';

--2. Display the name of students whose name consists of five characters.
Select FirstName from Students Where FirstName Like '_____'

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
Select FirstName, LastName, City from Students Where City Like '_____a'

--4. Display all the students whose last name ends with ‘tel’.
Select * from Students Where LastName Like '%tel'

--5. Display all the students whose first name starts with ‘ha’ & ends with ‘t’.
Select * From Students Where FirstName Like 'ha%t'

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
Select * From Students Where FirstName Like 'k_y%'

--7. Display the name of students having no website and name consists of five characters.
Select FirstName From Students Where Website is null And Firstname Like '_____'

--8. Display all the students whose last name consists of ‘jer’. 
Select * From Students Where LastName Like '%jer%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
Select * From Students Where City Like 'r%' or City Like 'b%'

--10. Display all the name students having websites.
Select * From Students Where Website is not null

--11. Display all the students whose name starts from alphabet A to H.
Select * From Students Where FirstName Like '[A-H] %'

--12. Display all the students whose name’s second character is vowel.
Select * From Students Where FirstName Like '_[AEIOU]%'

--13. Display student’s name whose city name consist of ‘rod’.
Select Firstname From Students Where City Like '%rod%'

--14. Retrieve the First & Last Name of students whose website name starts with ‘bi’.
Select Firstname, Lastname From Students Where Website Like 'bi%'

--15. Display student’s city whose last name consists of six characters.
Select City From Students Where Lastname Like '______'

--16. Display all the students whose city name consist of five characters & not starts with ‘ba’.
Select * From Students Where City Like '______' And City Not Like 'ba%'

--17. Show all the student’s whose division starts with ‘II’.
Select * From Students Where Division Like 'II%'

--18. Find out student’s first name whose division contains ‘bc’ anywhere in division name.
Select FirstName, Division From Students Where Division Like '%b%c%'

--19. Show student id and city name in which division consist of six characters and having website name. 
Select StuID, City From Students Where Division Like '______' And Website is not null

--20. Display all the students whose name’s third character is consonant.
Select * From Students Where FirstName Not Like '__[AEIOU]%'