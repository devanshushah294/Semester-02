public class Member{
	String name;
	int age;
	String phone_number;
	String address;
	double salary;
	public Member(String name, int age, String phone_number, String address , String salary){
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
	}
	public void printDetails(){
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("phone number = "+phone_number);
		System.out.println("address = "+address);
		System.out.println("salary = "+salary);
	}
	public void printSalary(){
		System.out.println("Salary = "+salary);
	}
}

class Manager extends Member{
	super(String name, int age, String phone_number, String address , String salary);
	String department;

}

class Employee extends Member{
	super(String name, int age, String phone_number, String address , String salary);
	String specialization;

}