public class Shapes{
	// private double radius;
	// private double length;
	// private double breadth;'

	// public void getRadius(double radius){
	// 	this.radius = radius;
	// }

	// public void getLength(double length){
	// 	this.length = length;
	// }

	// public void getBreath(double breadth){
	// 	this.breadth = breadth;
	// }

	public double getArea(double radius){
		return Math.PI*Math.pow(radius,2);
	}
	public double getArea(double length, double breadth){
		return length*breadth;
	}

}