package week1_shaominhao;

public class Practice2 {

	public static void main(String[] args) {
		//メソッド呼び出しと出力	 
		System.out.println(calcTriangleArea(10, 5));
		System.out.println(calcCircleArea(5));

	}

	//三角形の面積計算メソッド
	public static double calcTriangleArea(double base, double height) {
		return base * height / 2;

	}

	//円の面積計算メソッド
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
