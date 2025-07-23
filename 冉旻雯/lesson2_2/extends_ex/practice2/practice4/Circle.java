package lesson2_2.extends_ex.practice4;

//子クラス
//Shape クラスを継承し、Printable インタフェースを実装
public class Circle extends Shape implements Printable {
	//メンバー変数
	double radius;

	//コンストラクタ
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void print() {
	System.out.println("Printing a circle with radius: " + radius);
	}


	@Override
	void draw() {
		// TODO 自動生成されたメソッド・スタブ
		super.draw();
	}

}
