package lab2;

public class Square {

	private double length;
	private double area;
	private final String TYPE = "Squares";
	
	public Square(double l) {
		length = l;
		area = l*l;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
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
		return "is a square with a length of " + length + " and an area of " + area;
	}
	
}
