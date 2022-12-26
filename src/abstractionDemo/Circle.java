package abstractionDemo;

import java.util.Scanner;

public class Circle {
	final double pi = 3.14;
	public double calculateArea(double pi, double radius) {
		return pi*radius*radius;
	}
	
	public double circum(double pi, double radius) {
		return 2*pi*radius;
		
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double r = sc.nextDouble();
		
		
		System.out.println("The area of the circle with "+r+" radius is : "+circle.calculateArea(circle.pi,r));
		System.out.println("The circumference  of the circle with "+r+" radius is : "+circle.circum(circle.pi,r));

		
	}

}
