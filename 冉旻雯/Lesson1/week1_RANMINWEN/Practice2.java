package week1_RANMINWEN;

public class Practice2 {

	public static void main(String[] args) {
		// 面積の初期化
		//三角形は「alcTriangleArea」円は「calcCircleArea」
		double resultTriangle = alcTriangleArea(10.0, 5.0);
		double resultCircle = calcCircleArea(5.0);

		//メソッドを呼び出す
		System.out.println(resultTriangle);
		System.out.println(resultCircle);
	}

	//三角形の面積の計算
	//三角形の底辺はbase,高さはheight
	public static double alcTriangleArea(double base, double height) {
		//面積を計算する
		double resultTriangle = 0;
		resultTriangle = base * height / 2;
		return resultTriangle;
	}

	//円の面積の計算
	//円の半径はradius
	public static double calcCircleArea(double radius) {
		//面積を計算する
		double resultCircle = 0;
		resultCircle = radius * radius * 3.14;
		return resultCircle;
	}

}
