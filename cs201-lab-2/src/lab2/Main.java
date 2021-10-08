package lab2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		double shp1Area = 0;
		double shp2Area = 0;
		String shp1Type = "";
		String shp2Type = "";
		double shp1Val2 = 0;
		double shp2Val2 = 0;
		String cont = "y";
		boolean sw1 = true;
		boolean sw2 = true;
		
		
		Scanner n = new Scanner(System.in);
		List<Object> shapes = new ArrayList<Object>();
		
		
		do {
		sw1 = true;
		sw2 = true;

		System.out.println("You will choose two shapes and give the size parameters for each");
		System.out.println("Here are your options for shapes: circle, rectangle, square, triangle");
		
		
		System.out.println("What is your first shape?");
		String shape1 = n.next().toLowerCase();
		System.out.println("What is your first value for this shape?");
		double shp1Val1 = n.nextDouble();
		if(!(shape1.equals("circle") || shape1.equals("square"))) {
			System.out.println("What is your second value for this shape?");
			shp1Val2 = n.nextDouble();
		}
		
		
		System.out.println("What is your second shape?");
		String shape2 = n.next().toLowerCase();
		System.out.println("What is your first value for this shape?");
		double shp2Val1 = n.nextDouble();
		if(!(shape2.equals("circle") || shape2.equals("square"))) {
			System.out.println("What is your second value for this shape?");
			shp2Val2 = n.nextDouble();
		}

		
		while(sw1) {
			switch(shape1) {
			case "circle"	: Circle cir1 = new Circle(shp1Val1); shapes.add(cir1);	shp1Area = cir1.getArea(); shp1Type = cir1.getTYPE(); sw1 = false;						  		break;
			case "rectangle": Rectangle rec1 = new Rectangle(shp1Val1,shp1Val2); shapes.add(rec1); shp1Area = rec1.getArea(); shp1Type = rec1.getTYPE(); sw1 = false;				break;
			case "square"	: Square sqr1 = new Square(shp1Val1); shapes.add(sqr1); shp1Area = sqr1.getArea(); shp1Type = sqr1.getTYPE(); sw1 = false;								break;
			case "triangle"	: Triangle tri1 = new Triangle(shp1Val1,shp1Val2); shapes.add(tri1); shp1Area = tri1.getArea(); shp1Type = tri1.getTYPE(); sw1 = false;					break;
			default 		: System.out.println("ERROR CREATING SHAPE 1"); System.out.println("\n--------------------- \nWhat is your first shape again?"); shape1 = n.next().toLowerCase();
				}
		}
		
		
		while(sw2) {
			switch(shape2) {
			case "circle"	: Circle cir2 = new Circle(shp2Val1); shapes.add(cir2); shp2Area = cir2.getArea(); shp2Type = cir2.getTYPE(); sw2 = false;							break;
			case "rectangle": Rectangle rec2 = new Rectangle(shp2Val1,shp2Val2); shapes.add(rec2); shp2Area = rec2.getArea(); shp2Type = rec2.getTYPE(); sw2 = false;	 		break;
			case "square"	: Square sqr2 = new Square(shp2Val1); shapes.add(sqr2); shp2Area = sqr2.getArea(); shp2Type = sqr2.getTYPE(); sw2 = false;							break;
			case "triangle"	: Triangle tri2 = new Triangle(shp2Val1,shp2Val2); shapes.add(tri2); shp2Area = tri2.getArea(); shp2Type = tri2.getTYPE(); sw2 = false;				break;
			default 		: System.out.println("ERROR CREATING SHAPE 2"); System.out.println("\n--------------------- \nWhat is your second shape again?"); shape2 = n.next().toLowerCase();
			}
		}
		
		
		System.out.println("Object 1 " + shapes.get(0).toString());
		System.out.println("Object 2 " + shapes.get(1).toString());
		
		
		if(shp1Type.equals(shp2Type)) {
			System.out.print("The shapes are both " + shp1Type);
			if(shp1Area == shp2Area) System.out.println(" and have the same areas");
				else System.out.println(" but have different areas");
		}
		else if(!(shp1Type.equals(shp2Type))) {
			System.out.print("The shapes are both different shapes ");
			if(shp1Area == shp2Area) System.out.println("but have the same areas");
				else System.out.println("and have different areas");
		}
		
		System.out.println();
		System.out.println("Type \'y\' to play again, or \'n\' to terminate the program");
		cont = n.next();
		shapes.clear();

		}
		while(cont.equals("y"));
	}

}
