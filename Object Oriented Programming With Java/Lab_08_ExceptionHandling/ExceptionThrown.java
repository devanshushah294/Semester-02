// Java program to demonstrate exception is thrown
// how the runTime system searches th call stack
// to find appropriate exception handler.
import java.util.Scanner;
class ExceptionThrown
{
	static int divideByZero(int a, int b){
		int i = a/b;
		
		return i;
	}
	static int computeDivision(int a, int b) {		
		int res =0;
		try
		{
		res = divideByZero(a,b);
		}
		catch(NumberFormatException ex)
		{
		System.out.println("NumberFormatException is occurred");
		}
		return res;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int a = sc.nextInt();
		System.out.println("Enter the number 2:");
		int b = sc.nextInt();
		try
		{
			int i = computeDivision(a,b);
			System.out.println("The answer is "+i);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
