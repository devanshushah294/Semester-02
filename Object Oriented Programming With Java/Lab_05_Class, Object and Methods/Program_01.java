//Write a program to create circle class with area function to find area of circle.
import java.util.Scanner;
public class Program_01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shapes s1 = new Shapes();
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		System.out.println("Area of circle is : "+s1.getArea(radius));

		Shapes s2 = new Shapes();
		System.out.println("Enter the Length : ");
		double length = sc.nextDouble();
		System.out.println("Enter the breath : ");
		double breath = sc.nextDouble();
		System.out.println("Area of rectangle is : "+s2.getArea(length , breath));
	}
}