--1. Write a function to print numbers from 1 to 10. (Using while loop)
	Declare @no int
	set @no=1
	Begin
		While(@no<=10)
		Begin
			Print @no
			Set @no=@no+1
		End
	End

--2. Write a function to check where a given number is ODD or EVEN.
	Declare @n int
	set @n=12
	Begin
		If (@n%2=0)
		Begin
			Print 'Even Number'
		End
		Else
		Begin
			Print 'Odd Number'
		End
	End

--3. Write a function to print ODD numbers between 1 and 10.
	Declare @num int
	Set @num=1
	Begin
		While @num<=10
		Begin
			If(@num%2 = 0)
			Begin
				Print @num
			End
			Set @num = @num + 1
		End
	End

--4. Write a function to print Sum of numbers from 1 to 50.
	Declare @a int
	Declare @sum int
	Set @a=1
	Set @sum=0
	Begin
		While(@a<=50)
		Begin
			Set @sum = @sum + @a
			Set @a = @a + 1
		End
		Print @sum
	End

--5. Write a function to print Sum of even numbers between 1 to 20.
	Declare @b int
	Declare @esum int
	Set @b=1
	Set @esum=0
	Begin
		While(@b<=20)
		Begin
			If(@b%2=0)
			Begin
				Set @esum = @esum + @b
				Set @b = @b + 1
			End
		End
		Print @esum
	End
--6. Write a function to check whether a given number is prime or not.
	Declare @x int, @i int, @flag int
	Set @x=7
	Set @i=2
	Set @flag=0
	Begin
		While @i<=@x/2
		Begin
			If (@x%@i=0)
			Begin
			Set @flag=1
			break
			End
		Set @i = @i + 1
		End
		If (@flag=0)
		Begin
			Print ' Prime Number'
		End
		Else
		Begin
			Print ' Not Prime Number'
		End
	End

--7. Write a function for inserting even numbers into even table & odd numbers into odd table between 1 to 50.
	Create Table Even_No(numbers int)
	Create Table Odd_No(numbers int)
	Declare @y int
	Set @y=1
	While(@y<=50)
	Begin
		If(@y%2=0)
		Begin
			Insert Into Even_No Values(@y)
		End
		Else
		Begin
			Insert Into Odd_No Values(@y)
		End
		Set @y=@y+1
	End
	Select * From Even_No
	Select * From Odd_No