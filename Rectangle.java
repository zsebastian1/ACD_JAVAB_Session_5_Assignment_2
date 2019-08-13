package ACADAssignments;

import java.util.Scanner;

public class Rectangle extends Figure {
	
	Scanner input = new Scanner(System.in);

void findArea() {
		double length = input.nextDouble();
		double width = input.nextDouble();
		double area = length * width;
		System.out.println("The area of this rectangle is: " + area);
	}
	
	void findPerimeter() {
		double side1 = input.nextDouble() * 2;
		double side2 = input.nextDouble() * 2;
		//double side3 = input.nextDouble();
		//double side4 = input.nextDouble();

		double perimeter = side1 + side2;
		
		System.out.println("The perimeter of this rectangle is: " + perimeter);
	} 
}
