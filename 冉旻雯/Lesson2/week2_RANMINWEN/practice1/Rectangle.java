package week2_RANMINWEN.practice1;
//親クラス
//長方形
//Printxインタフェースを実装
public class Rectangle implements Printx {
	//高さ
	protected double height;
	//幅
	protected double width;

	//コンストラクタ
	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	//面積の計算
	public double getArea() {
		return height * width;
	}

	//周長の計算
	public double getPerimeter() {
		return (height + width) * 2;
	}

	//インターフェースを実装
	// 長方形の計算結果です
	@Override
	public void printx() {
		System.out.println("長方形の高さ：" + height + "、幅：" + width +
				"、面積：" + getArea() + "、周長：" + getPerimeter());

	}

}
