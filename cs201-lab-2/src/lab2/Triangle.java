package lab2;

public class Triangle {
	private double base;
	private double height;
	private double area;
	private final String TYPE = "Triangles";
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
		area = 0.5*b*h;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getTYPE() {
		return TYPE;
	}
	
	
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String toString() {
		return "is a triangle with a base of " + base + " and an height of " + height + " and an area of " + area;
	}

}
