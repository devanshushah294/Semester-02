// Write a program to convert temperature from Fahrenheit to Celsius. 
// (Formula : c = f-32*5/9 );
import java.util.Scanner;
public class Ex_2_5{
    public static void main(String[] args) {
        System.out.println("Enter the value of Fahrenheit = ");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextFloat();
        double Celsius = f-32*5/9;
        System.out.println("Celsius = " + Celsius);
    }
    
}
