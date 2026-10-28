package Exercises;

import java.util.Scanner;

public class CircleDriver {
	public static void main(String[] args) {
		// Circle1 uses the default constructor
		Circle circle1 = new Circle();

		System.out.println("Circle1");
		System.out.println("getRadius: " + circle1.getRadius());
		System.out.println("getDiameter: " + circle1.getDiameter());
		System.out.println(circle1.toString());

		// Circle2 uses the radius the user types in
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter a radius for Circle2: ");
		double userRadius = scanner.nextDouble();

		Circle circle2 = new Circle(userRadius);

		System.out.println("\nCircle2");
		System.out.println("getRadius: " + circle2.getRadius());
		System.out.println("getDiameter: " + circle2.getDiameter());
		System.out.println(circle2.toString());

		scanner.close();
	}
}