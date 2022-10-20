//Write a program to check that the given number is prime or not.
import java.util.Scanner;
public class Ex_3_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2 ; i<=n/2 ; i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(n + " number is not prime number");
        }
        else{
            System.out.println(n + " number is prime");
        }
    }
}