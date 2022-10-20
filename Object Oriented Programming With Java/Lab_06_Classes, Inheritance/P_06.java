/*Declare a class called student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, 
grade_obtained and spi. Define constructor and calculate_spi 
methods.Define main to instantiate an array for objects of class student 
to process data of n students to be given as command line arguments.
*/
import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registered;
	String[] subject_code;
	int[] subject_credits;
	int total_credit = 0;
	String[] grade_obtained;
	int [] mul_as_per_grade;
	double spi;
	Scanner sc = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	public Student(int id_no, int no_of_subjects_registered){
		this.id_no = id_no;
		this.no_of_subjects_registered = no_of_subjects_registered;
		subject_code = new String[no_of_subjects_registered];
		subject_credits = new int[no_of_subjects_registered];
		grade_obtained = new String[no_of_subjects_registered];
		mul_as_per_grade = new int[no_of_subjects_registered];
	}

	public void setSubjectInfo(){
		for(int i = 0; i<no_of_subjects_registered; i++ ){
				System.out.println("Enter the subject "+(i+1)+" code:");
				subject_code[i] = sc.nextLine();
				System.out.println("Enter the subject credit:");
				subject_credits[i] = input.nextInt();
				total_credit += subject_credits[i];
				System.out.println("Enter the grade: ");
				grade_obtained[i] = sc.nextLine();
				if (grade_obtained[i].equalsIgnoreCase("a+")){mul_as_per_grade[i] = 10; }
				else if(grade_obtained[i].equalsIgnoreCase("a")){mul_as_per_grade[i] = 9;}
				else if(grade_obtained[i].equalsIgnoreCase("b+")){mul_as_per_grade[i] = 8;}
				else if(grade_obtained[i].equalsIgnoreCase("b")){mul_as_per_grade[i] = 7; }
				else if(grade_obtained[i].equalsIgnoreCase("c+")){mul_as_per_grade[i] = 6; }
				else if(grade_obtained[i].equalsIgnoreCase("c")){mul_as_per_grade[i] = 5; }
		}

	}
	public void printSubjectInfo(){
		for (int i = 0; i<no_of_subjects_registered; i++) {
			System.out.println("Credit of subject "+(i+1)+" are: "+subject_credits[i]);
			System.out.println("code of subject "+(i+1)+"is: "+subject_code[i]);
			System.out.println("grade_obtained"+(i+1)+"are"+grade_obtained[i]);
		}
	}
	public void countAndPrintSpi(){
		for (int i = 0 ; i<no_of_subjects_registered ;i++ ) {
			spi += mul_as_per_grade[i]*subject_credits[i];
		 }
		 spi /= total_credit;
		 System.out.println("The spi of given student is: "+spi);
	}

}
public class P_06{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id number:");
		int id_no = scan.nextInt();
		System.out.println("Enter the no of subjects:");
		int no_of_subjects_registered = scan.nextInt();
		Student student_01 = new Student(id_no,no_of_subjects_registered);
		System.out.println(student_01.no_of_subjects_registered);
		student_01.setSubjectInfo();
		student_01.printSubjectInfo();
		student_01.countAndPrintSpi();

	}
}