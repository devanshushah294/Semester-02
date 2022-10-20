// Write a program to find that given number or string is palindrome or not.
import java.util.Scanner;
    public class Ex_3_2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any string = ");
            String str1 = sc.nextLine();
            StringBuffer str = new StringBuffer(str1);
            str.reverse();
            if(str.toString().equals(str1))
            {
                System.out.println("string is palindrome");
            }
            else
            {
                System.out.println("string is not palindrome");
            }
        }
    }
