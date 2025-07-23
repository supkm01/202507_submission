package lesson2_2.extends_ex.practice4;

//子class
public class Circle extends Shape implements Printable {
	//メンバー変数
	double radius;

	//コンストラクタ
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//メソッド:
	@Override
	public void print() {
		System.out.println("Printing a circle with radius: ["+radius+"]");

	}

}
