// Create a class named 'Member' having the following members:
// 1-Name
// 2-Age
// 3-Phone number
// 4-Address
// 5-Salary
// It also has a method named 'printSalary' which prints the salary of the 
// members.
// Two classes 'Employee' and Manager' inherits the 'Member' class. The 
// 'Employee' and 'Manager' classes have data members 'specialization' 
// and 'department' respectively. Now assign name, age, phone number 
// address and salary to an employee and a manager by making an object 
// of both of these classes and print the same along with specialization and 
// department respectively.
import java.util.Scanner;
class Member{
    String Name;
    int Age;
    int Phone_number;
    String Address;
    double Salary;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    void getData(){
        System.out.println("Enter Name = ");
        Name = sc1.nextLine();
        System.out.println("Enter Age = ");
        Age = sc.nextInt();
        System.out.println("Enter Phone Number = ");
        Phone_number = sc.nextInt();
        System.out.println("Enter Address = ");
        Address = sc1.nextLine();
        System.out.println("Enter Salary = ");
        Salary = sc.nextDouble();
        System.out.println("Enter Specialization = ");
        specialization = sc1.nextLine();
        System.out.println("Enter Department = ");
        department = sc1.nextLine();
    }
    void printsalary(){
        System.out.println("Name is " + Name);
        System.out.println("Age = " + Age);
        System.out.println("Phone number  is " + Phone_number);
        System.out.println("Address is " + Address);
        System.out.println("Salary is " + Salary);
        System.out.println("specialization is " + specialization);
        System.out.println("Department is " + Department);

    }
} 
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
public class Ex_6_3{
    public static void main(String[] args) {
        Member e = new Employee();
        Member m = new Manager();
        e.getData();
        m.getData();
        e.printsalary();
        m.printsalary();
    }
}
