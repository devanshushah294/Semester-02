
// Write a program to get 2 numbers from the user and print the sum of 
// two numbers using command line and Scanner class
import java.util.Scanner;
public class Ex_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a = ");
        int a = sc.nextInt();
        System.out.println("Enter number b = ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum of number is "+c);
    }
}
