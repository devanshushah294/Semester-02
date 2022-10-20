// Write a program to calculate the area of circle
import java.util.Scanner;
public class Ex_2_4{
    public static void main(String[] args) {
        System.out.println("Enter radius of circie = ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double ans = 3.14*r*r;
        System.out.println(ans);
    }
}