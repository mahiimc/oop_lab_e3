/**
 Oop concept covered : interface, encapsulation , method Overriding
 Exception Handling
 */
public interface Shape {
	abstract void getArea();
	
	abstract void getPerimeter();

}

class Square implements Shape {
	private double side;
	public void setSide(double side) {
		this.side=side;
	}
	public double getSide() {
		return  side;
		}
	
	@Override
	public void getArea() {
		System.out.printf("Area of Square : %.3f\n",Math.pow(getSide(), 2));
	}

	@Override
	public void getPerimeter() {
		System.out.printf("Perimeter of Square : %.3f\n",(4*getSide()));
		
	}
	
}
class Circle implements Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.format("Area of the Circle : %.3f\n",(Math.PI *Math.pow(getRadius(), 2)));
	}

	@Override
	public void getPerimeter() {	
		System.out.format("Circumference(Perimeter) of Circle :%.3f\n",(2*Math.PI*getRadius()));
		
	}
}
class Rectangle implements Shape{
	
	private double length,breadth;
	@Override
	public void getArea() {
		System.out.format("Area of the Rectangle :%.3f\n",(getLength()*getBreadth()));
		
	}
	@Override
	public void getPerimeter() {
		System.out.printf("Perimeter of the Rectangle :%.3f\n",(2*(getLength()+getBreadth())));
		
	}
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}


// Class to Test our Program
class TestClassForShape {

	public static void main(String[] args) {
		final java.util.Scanner in = new java.util.Scanner(System.in); // Scanner to get values from end user 
		double radius = 0,side=0,length=0,breadth=0;
		try {
		System.out.print("Radius of the circle :");
		radius = in.nextDouble();
		System.out.print("Side of the Square :");
		side = in.nextDouble();
		System.out.print("Length of the Rectangle :");
		length = in.nextDouble();
		System.out.print("Breadth of the Rectangle :");
		breadth = in.nextDouble();
		System.out.println("----------------->Result<-----------------");
		Shape circle = new Circle(); // Circle
		((Circle) circle).setRadius(radius);
		circle.getArea();
		circle.getPerimeter();
		
		Shape square = new Square();	// Square
		((Square) square).setSide(side);
		square.getArea();
		square.getPerimeter();
		
		Shape rectangle = new Rectangle();
		((Rectangle) rectangle).setLength(length);
		((Rectangle) rectangle).setBreadth(breadth);
		rectangle.getArea();
		rectangle.getPerimeter();
		
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("input must be given as required");
		}
		finally {
		in.close(); // closing Scanner
		}
		
		
	}
}




