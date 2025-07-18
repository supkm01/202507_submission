package week1_oushigou;

public class Practice2 {

	public static void main(String[] args) {
		//baseは10.0、heightは5.0の三角形の面積を計算します。
		System.out.println(calcTriangleArea(10.0, 5.0));

		//radiusは5.0の円形の面積を計算します。
		System.out.println(calcCircleArea(5.0));

	}

	//三角形の面積を計算するメソッド
	public static double calcTriangleArea(double base, double height) {
		return base * height / 2;
	}

	//円の面積を計算するメソッド
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
