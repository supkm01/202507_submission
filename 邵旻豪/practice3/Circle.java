package lesson2_1.practice3;

public class Circle {
	//メンバー変数
	double radius;

	//コンストラクタ
	public Circle(double radius) {
		this.radius = radius;
		area();
	}

	//面積計算メソッド
	void area() {
		System.out.println(radius * radius * 3.14);
	}
}
