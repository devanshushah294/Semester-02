create database Devanshu

create table deposit
(
	actno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2),
	adate datetime
)

create table branch
(
	bname varchar(50),
	city varchar(50)
)

create table customers
(
	cname varchar(50),
	city varchar(50)
)

create table borrow 
(
	loanno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2)
)

insert into deposit values(101,'anil','vrce',1000,'1995-03-01')
insert into deposit values(102,'sunil','ajni',5000,'1996-01-04')
insert into deposit values(103,'mehul','karolbagh',3500,'1995-11-17')
insert into deposit values(104,'madhuri','chandi',1200,'1995-12-17')
insert into deposit values(105,'prmod','m.g.road',3000,'1996-03-27')
insert into deposit values(106,'sandip','andheri',2000,'1996-03-31')
insert into deposit values(107,'shivani','virar',1000,'1995-09-05')
insert into deposit values(108,'kranti','nehru place',5000,'1995-07-02')
insert into deposit values(109,'minu','powai',7000,'1995-08-10')

insert into branch values('vrce','nagpur')
insert into branch values('ajni','nagpur')
insert into branch values('karolbagh','delhi')
insert into branch values('chandi','delhi')
insert into branch values('dharampeth','nagpur')
insert into branch values('m.g.road','banglore')
insert into branch values('andheri','bombay')
insert into branch values('virar','bombay')
insert into branch values('nehru place','delhi')
insert into branch values('powai','bombay')

insert into customers values('anil','calcutta')
insert into customers values('sunil','delhi')
insert into customers values('mehul','baroda')
insert into customers values('mandar','patan')
insert into customers values('madhuri','nagpur')
insert into customers values('pramod','nagpur')
insert into customers values('sandip','surat')
insert into customers values('shivani','bombay')
insert into customers values('kranti','bombay')
insert into customers values('naren','bombay')

insert into borrow values(201,'anil','vrce',1000)
insert into borrow values(206,'mehul','ajni',5000)
insert into borrow values(311,'sunil','dharampeth',3000)
insert into borrow values(321,'madhuri','andheri',2000)
insert into borrow values(375,'prmod','virar',8000)
insert into borrow values(481,'kranti','nehru place',3000)


/*2.1*/
/*1. Retrieve all data from table DEPOSIT.*/
select * from deposit

/*2.Retrieve all data from table BORROW. */
select * from borrow

/*3.Retrieve all data from table CUSTOMERS.*/	
select * from customers

/*4.Display Account No, Customer Name & Amount from DEPOSIT.*/	
select actno,cname,amount from deposit

/*5.Display Loan No, Amount from BORROW.*/	
select loanno,amount from borrow

/*6.Display loan details of all customers who belongs to ‘ANDHERI’ branch.*/	
select * from borrow where bname='andheri'

/*7.Give account no and amount of depositor, whose account no is equals to 106.*/	
select actno,amount from deposit where actno = 106

/*8. Give name of borrowers having amount greater than 5000. */
Select cname from borrow where amount >5000

/*9. Give name of customers who opened account after date '1-12-96'. */
select cname from deposit where adate >'1996-12-01'

/*10. Display name of customers whose account no is less than 105.*/
select cname from deposit where actno<105

/*11. Display name of customer who belongs to either ‘NAGPUR’ Or ‘DELHI’. (OR & IN)*/
select cname from customers where city='nagpur' or city='delhi'
select cname from customers where city in('nagpur','delhi')

/*12. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105.*/
select cname,bname from deposit where amount>4000 and actno<105

/*13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000.(AND & BETWEEN)*/
select cname from borrow where amount>=3000 and amount<=8000
select cname from borrow where amount between 3000 and 8000

/*14. Find all depositors who do not belongs to ‘ANDHERI’ branch.*/
select cname from deposit where bname!='andheri'
select cname from deposit where bname<>'andheri'

/*15. Display the name of borrowers whose amount is NULL.*/
select cname from borrow where amount is null

/*16. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ Or ‘M.G. ROAD’ and Account No is less than 104.*/
select actno,cname,amount from deposit where bname  in('ajni','karolbagh','m.g.road')

/*17. Display all the details of first five customers.*/
select top 5 * from deposit

/*18. Display all the details of first three depositors whose amount is greater than 1000.*/
select top 3 * from deposit where amount>1000

/*19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI’.*/
select top 5 loanno,cname from borrow where bname<>'andheri'

/*20. Retrieve all unique cities using DISTINCT. (Use Customers Table)*/
select distinct city from customers

/*21. Retrieve all unique branches using DISTINCT. (Use Branch Table)*/
select distinct bname from branch 

/*22. Retrieve all the records of customer table as per their city name in ascending order.*/
select * from customers order by city asc

/*23. Retrieve all the records of deposit table as per their amount column in descending order.*/
select * from deposit order by amount asc
select * from deposit order by amount desc

/*24. Retrieve all the details of customers in which decending order of their city name.*/
select * from customers order by city desc

/*25. Show all unique borrowers & label the column UNI_Borrowers. (Display only Names)*/
select  cname as uni_barrowers from borrow


/*2.2*/
/*1. Update deposit amount of all customers from 3000 to 5000.*/
update deposit set amount=5000 where amount=3000

/*2. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table) */
update borrow set bname='c.g.road' where bname='vrce' and cname='anil'

/*3. Update Account No of SANDIP to 111 & Amount to 5000.*/
update deposit set actno=111,amount=5000 where cname='sandip'

/*4. Give 10% Increment in Loan Amount.*/
update borrow set amount=amount+(amount*.1)

/*5. Update deposit amount of all depositors to 5000 whose account no between 103 & 107.*/
update deposit set amount=5000 where actno>103 and actno<107

/*6. Update amount of loan no 321 to NULL.*/
update borrow set amount = null where loanno=321 

/*7. Change Loan number from 201 to 401 & also change branch name from VRCE to AJNI.*/
update borrow set bname='ajni', loanno=401 where loanno=201 and bname='c.g.road'

/*8. Modify customer name ANIL to ANIL JAIN.*/
update customers set cname='anil jain' where cname='anil'

/*9. Change Name to Ramesh, Branch Name VRCE & Amount 5500, Whose Account Number is 102.*/
update deposit set cname='ramesh', amount=5500 ,bname='vrce' where actno=102

/*10. Make Branch Name & Amount NULL, Whose Loan Number is 481 & Name is KRANTI.*/
update borrow set bname=null , amount=null where loanno=481 and cname='kranti'


/*2.3*/
/*1. Delete records of Customer table who belongs to BOMBAY City.*/
delete from customers where city='bombay'

/*2. Delete all account numbers whose amount less than equals to 1000.*/
delete from deposit where amount<1000

/*3. Delete borrowers whose branch name is ‘AJNI’.*/
delete from borrow where bname='ajni'

/*4. Delete all the borrowers whose loan number between 201 to 210.*/
delete from borrow where loanno>201 and loanno<210

/*5. Delete customers who opened account after date '1-12-96'. (Use DEPOSIT table)*/
delete from deposit where adate>'1996-12-01'

/*6. Delete all the records of Customers table. (Use TRUNCATE)*/
truncate table customers 

/*7. Remove all customers whose name is ANIL & Account Number is 101.*/
delete from deposit where actno=101 and cname='anil'

/*8. Delete all the depositors who do not belongs to ‘ANDHERI’ branch.*/
delete from deposit where bname<>'andheri'

/*9. Delete all the borrowers whose loan amount is less than 2000 and does not belong to VRCE branch.*/
delete from borrow where amount<2000 and bname<>'vrce'

/*10. Remove Branch table. (Use DROP)*/
drop table branch