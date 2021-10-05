package lab2;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private final String TYPE = "Rectangles";

	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
		area = l*w;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
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
		return "is a rectangle with a length of " + length + " and an width of " + width + "and an area of " + area;
	}
}
