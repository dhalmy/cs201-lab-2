package lab2;

public class Circle {
	private double radius;
	private double area;
	private final double PI = Math.PI;
	private final String TYPE = "Circles";

	public Circle(double radius) {
		this.radius = radius;
		area = PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public String getTYPE() {
		return TYPE;
	}
	
	public String toString() {
		return "is a circle with a radius of " + radius + " and an area of " + area;
	}
	
}
