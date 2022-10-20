// Declare a class called student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, 
// grade_obtained and spi. Define constructor and calculate_spi 
// methods.Define main to instantiate an array for objects of class student 
// to process data of n students to be given as command line arguments.
import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    int subject_code[] = new int[10];
    int subject_credits[] = new int[10];
    int grade_obtained[] = new int[10];
    double spi;
    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id_no = ");
        id_no = sc.nextInt();
        System.out.println("Enter no_of_subjects_registered = ");
        no_of_subjects_registered = sc.nextInt();

        for(int i=0;i<no_of_subjects_registered;i++){
            System.out.println("Enter subject_code = ");
            subject_code[i] = sc.nextInt();
            System.out.println("Enter grade_obtained = ");
            grade_obtained[i] = sc.nextInt();
            System.out.println("Enter subject_credits = ");
            subject_credits[i] = sc.nextInt();
        }
    }
    double calculatespi(){
        int temp = 0;
        int total = 0;
        for(int i=0; i<no_of_subjects_registered;i++){
             temp = temp+(subject_credits[i] * grade_obtained[i]);
            total = total+ subject_credits[i];
    }
        spi = temp/total;
        return spi;
    }
}
class Ex_6_1{
    public static void main(String[] args) {
        Student s[] = new Student[2];
        for( int i=0;i<2;i++){
             s[i] = new Student();
             System.out.println("SPI = " + s[i].calculatespi());
        }
        
    }
}

