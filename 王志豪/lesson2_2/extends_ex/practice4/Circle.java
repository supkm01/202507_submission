package lesson2_2.extends_ex.practice4;

public class Circle extends Shape implements Printable{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void print(){
		System.out.println("Printing a circle with radius:" + radius);
	}
}
