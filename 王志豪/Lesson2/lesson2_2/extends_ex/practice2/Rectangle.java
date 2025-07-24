package lesson2_2.extends_ex.practice2;

public class Rectangle implements Shape {

	//メンバ変数
	double width;
	double high;

	//コンストラクタ
	public Rectangle(double width, double high) {
		this.width = width;
		this.high = high;
	}

	@Override
	public double getArea() {
		return width * high;
	}

}
