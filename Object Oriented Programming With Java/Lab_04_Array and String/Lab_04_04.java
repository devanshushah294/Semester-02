/*
Write a program to find length of string and print second half of the string.
*/
import java.util.Scanner;
public class Lab_04_04{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Length of the string is "+str.length());
		int string_length = str.length();
		int half_string_length = string_length/2;
		System.out.println(str.substring(int string_length, int half_string_length);

	}
}