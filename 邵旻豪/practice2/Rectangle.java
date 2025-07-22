package lesson2_2.extends_ex.practice2;

//インタフェースを実装
public class Rectangle implements Shape {
	//メンバ変数
	double height, width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		double result = height * width;
		return result;
	}

}
