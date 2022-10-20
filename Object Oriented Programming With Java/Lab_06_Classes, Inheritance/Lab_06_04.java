/*
Design a class named MyPoint to represent a point with x- and ycoordinates. The class contains:
The data fields x and y that represent the coordinates with getter 
methods.
o a no-arg constructor that creates a point (0, 0).
o a constructor that constructs a point with specified coordinates.
o a method named distance that returns the distance from this point 
to a specified point of the MyPoint type.
o a method named distance that returns the distance from this point 
to another point with specified x- and y-coordinates.
*/
import java.util.Scanner;
class MyPoint{
	double x;
	double y;
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double distance(){
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	public double distance(double x1, double y1){
		return Math.sqrt(Math.pow((x-x1),2)+Math.pow((y-y1),2));
	} 
}
public class Lab_06_04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x-coordinate:");
		double x = sc.nextDouble();
		System.out.println("Enter the y-coordinate:");
		double y = sc.nextDouble();
		MyPoint p1 = new MyPoint(x,y);
		System.out.println("Enter the x-coordinate of the another point:");
		double x1 = sc.nextDouble();
		System.out.println("Enter the y-coordinate of the another point:");
		double y1 = sc.nextDouble();
		System.out.println("The distance between given two points is :"+p1.distance(x1,y1));
		System.out.println("The distance between given point and (0,0) is")
	}
}