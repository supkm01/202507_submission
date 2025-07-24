package lesson2_2.extends_ex.practice2;

public class Main {

	public static void main(String[] args) {
		Circle circle1 = new Circle(2.0);
		Rectangle rectangle1 = new Rectangle(4.0, 5.0);
		
		//面積をそれぞれ表示します。
		System.out.println(circle1.getArea());
		System.out.println(rectangle1.getArea());

	}

}
