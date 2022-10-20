// Write a program to find length of string and print second half of the 

import java.util.Scanner;
public class HalfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int l = str.length();
        System.out.println("Your string is = "+str.substring(l/2));
    }
}
