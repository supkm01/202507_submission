package lesson2_2.extends_ex.practice2;

public class Circle implements Shape {
	//メンバ変数半径
	double radius;

	//コンストラクタ

	public Circle(double radius) {
		this.radius = radius;
	}

	//オーバーライド
	//円の面積の計算「 半径 × 半径 ×3.14 」
	@Override
	public double getArea() {

		return radius * radius * 3.14;

	}

}
