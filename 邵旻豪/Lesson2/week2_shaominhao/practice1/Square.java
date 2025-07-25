package week2_shaominhao.practice1;

//Rectangleクラスを継承する
public class Square extends Rectangle {
	//コンストラクタ
	public Square(double side) {
		super(side, side);
	}

	@Override
	public void printx() {
		System.out.println("正方形の長さ：" + height + "、面積：" + getArea() + "、周長：" + getPerimeter());
	}

}
