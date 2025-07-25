package week2_oushigo.practice1;

public class Rectangle implements Printx {
	//インスタンス変数
	protected double height;
	protected double width;

	//コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	//面積計算メソッド
	public double getArea() {
		return height * width;
	}

	//周長計算メソッド
	public double getPerimeter() {
		return (height + width) * 2;
	}

	//インスタンスの実装メソッド
	public void printx() {
		System.out.println("長方形の高さ：" + height + "、幅：" + width
				+ "、面積：" + getArea() + "、周長：" + getPerimeter());
	}

}
