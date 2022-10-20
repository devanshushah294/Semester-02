// The marks obtained by a student in 5 different subjects are input through 
// the keyboard. 
// The student gets a division as per the following rules:
// I. Percentage above or equals to 60-first division
// II. Percentage between 50 to 59-second division
// III. Percentage between 40 and 49-Third division
// IV. Percentage less than 40-fail
// Write a program to calculate the division obtained by the student.
import java.util.Scanner;

import javax.sql.rowset.Predicate;
public class Ex_3_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of OOP = ");
        double oop = sc.nextDouble();
        System.out.println("Enter the marks of OAT");
        double oat = sc.nextDouble();
        System.out.println("Enter the marks of Engennring Graphic = ");
        double eg = sc.nextDouble();
        System.out.println("Enter the marks of Maths = ");
        double maths = sc.nextDouble();
        System.out.println("Enter the marks of Fundamental of Electronic = ");
        double fe = sc.nextDouble();
        double per = (oop+oat+eg+fe+maths)/5;
        if(per<=40)
        {
            System.out.println("You are Fail");
        }
        else if(per>40 && per<=49)
        {
            System.out.println("You are in Third Division");
        }
        else if(per>=50 && per<=59)
        {
            System.out.println("You are in Second Division");
        }
        else{
            System.out.println("You are in First Division");
        }

    }
}