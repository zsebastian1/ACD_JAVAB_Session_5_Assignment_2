package ACADAssignments;
import java.util.Scanner;

public class Circle extends Figure {

	Scanner input = new Scanner(System.in);
	void findArea() {
		double area;
		final double PI = 3.14;
		double radius = input.nextDouble();
		
		area = PI * (radius * radius);
		
		System.out.println("The area of this circle is: " + area);
	}
	
	void findPerimeter() {
		
		final double PI = 3.14;
		double radius = input.nextDouble();
		double circumference = PI * (2 * radius);
		
		System.out.println("The perimeter (circumference) of this circle is: "+ circumference);
	}
}
