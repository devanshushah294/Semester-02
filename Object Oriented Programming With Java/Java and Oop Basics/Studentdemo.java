import java.util.Scanner;
class Student{
    int roll_no;
    String name;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number = ");
        roll_no = sc.nextInt();
        System.out.println("Enter Name = ");
        name = sc.next();
    }

    void displaydata(){
        System.out.println("Roll number = "+ roll_no);
        System.out.println("Name = "+ name);
    }
}

class Studentdemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getdata();
        s1.displaydata();
        System.out.println("========================");
        s2.getdata();
        s2.displaydata();
    }
}
