package Exercises;

import java.text.DecimalFormat;

public class Circle {
	private double radius;
	private DecimalFormat df;

	// Default constructor: radius 1.0
	public Circle() {
		this.radius = 1.0;
		this.df = new DecimalFormat("#.##");
	}

	// Constructor with user-defined radius
	public Circle(double radius) {
		this.radius = radius;               // left = the field, right = the parameter
		this.df = new DecimalFormat("#.##");
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getDiameter() {
		return 2 * this.radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);   // π * r^2
	}

	@Override
	public String toString() {
		return "A circle with radius " + df.format(this.radius) +
			" has a diameter of " + df.format(this.getDiameter()) +
			" and an area of " + df.format(this.getArea());
	}
}