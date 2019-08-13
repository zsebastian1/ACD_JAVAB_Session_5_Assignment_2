package ACADAssignments;

import java.util.Scanner; 

public class Triangle extends Figure {

	Scanner input = new Scanner(System.in);

	
	void findArea() {
		// area for a triangle is height x base / 2
	double height = input.nextDouble();
	double base = input.nextDouble();
	double area = (height * base) / 2;
	System.out.println("The area is: " + area);
		
	}
	
	void findPerimeter() {
		// add all sides, a + b + c
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		double perimeter = side1 + side2 + side3;

		System.out.println("The perimeter of the triangle is: " + perimeter);
		
	}
	
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		System.out.println("Enter the value for the 3 sides of your triangle to get your perimeter: ");
		tri.findPerimeter();
		System.out.println("Enter your height and base to find the area of your triangle: ");
		tri.findArea();
		
	}
}
