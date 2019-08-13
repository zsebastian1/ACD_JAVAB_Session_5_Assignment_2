package ACADAssignments;

public class Assignment5_2 {

	public static void main(String[] args) {
	Triangle tri = new Triangle();
	Rectangle rec = new Rectangle();
	Circle circ = new Circle();
	System.out.println("Enter the value for the 3 sides of your triangle to get your perimeter: ");
	tri.findPerimeter();
	System.out.println("Enter your height and base to find the area of your triangle: ");
	tri.findArea();
	
	System.out.println("Enter the value for the sides that will make up your rectangle's perimeter: ");
	rec.findPerimeter();
	System.out.println("Enter the value for the length and width respectively to find your rectangle's area: ");
	rec.findArea();
	
	System.out.println("Enter the value for your radius to calculate the value of your perimeter (circumference): ");
	circ.findPerimeter();
	System.out.println("Enter the value for your radius to calculate the value of your area: ");
	circ.findArea();
}

}