package week2_RANMINWEN.practice1;
//Rectangleクラスの子クラス
//正方形 
public class Square extends Rectangle {
	//コンストラクタ
	public Square(double height) {
		super(height, height);
	}

	//インターフェースを実装
	// 正方形の計算結果です
	@Override
	public void printx() {
		System.out.println("正方形の辺の長さ：" + height +
				"、面積：" + getArea() + "、周長：" + getPerimeter());
	}

}
