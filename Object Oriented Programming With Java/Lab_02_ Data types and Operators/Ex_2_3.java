/* Write a program to create basic calculator by getting 2 numbers and 1 
string (operation) from the user and apply the operation given in a string 
on the given numbers.*/
import java.util.Scanner;
public class Ex_2_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a = ");
        int a = sc.nextInt();
        System.out.println("Enter number b = ");
        int b = sc.nextInt();
        System.out.println("Enter choise = ");
        String ch = sc.next();
        switch (ch) {
            case "+" : 
            System.out.println(a+b);
            break;
            case "-" :
            System.out.println(a-b);
            break;
            case "*" :
            System.out.println(a*b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            default :
            System.out.println("Enter the valid operator");
        }
    }
}