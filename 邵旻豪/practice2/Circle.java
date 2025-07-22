package lesson2_2.extends_ex.practice2;

//インタフェースを実装
public class Circle implements Shape {
	//メンバ変数
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double result = radius * radius * 3.14;
		return result;
	}

}
