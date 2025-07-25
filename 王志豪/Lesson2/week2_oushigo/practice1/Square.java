package week2_oushigo.practice1;

public class Square extends Rectangle {

	//メンバ変数
	protected double side;

	//コンストラクタ
	//正方形の辺の長さを長方形の高さと幅にします。
	public Square(double side) {
		super(side, side);
	}

	//オーバーラードした表示メソッド
	public void printx() {
		System.out.println("正方形の辺の長さ：" + height +
				"、面積：" + getArea() + "、周長：" + getPerimeter());
	}

}
