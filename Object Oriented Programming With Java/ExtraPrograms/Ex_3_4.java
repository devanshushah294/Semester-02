 // Write a program to find maximum no from given 3 no.
import java.util.Scanner;
public class Ex_3_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a = ");
        int a = sc.nextInt();
        System.out.println("Enter number b = ");
        int b = sc.nextInt();
        System.out.println("Enter number c = ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }            
        }
        else if(a==b){
            if(a>c){
                System.out.println("a is largest");
            }
        }
        else if(a==c){
            if(b>c){
                System.out.println("b is largest");
            }
        }
        else if(b==c){
            if(a>b){
                System.out.println("a is largest");
            }
        }
        else{
            System.out.println("a , b , c are equal");
        }
    }
}