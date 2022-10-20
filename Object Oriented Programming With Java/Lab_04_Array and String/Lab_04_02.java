/*
Write a program that creates and initializes a four integer element array. Calculate and 
display the average of its values
*/
import java.util.Scanner;
public class Lab_04_02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int sum = 0 ;
		for(int i = 0 ; i<4 ; i++){
			System.out.println("Enter the number :-");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = (double)sum/4;
		System.out.println("The average is"+avg);
	}
}