package lesson1_3.method.practice;

public class Practice2 {

	public static void main(String[] args) {
		//呼び出し
		System.out.println(calculateStringLength("こんにちは"));
	}

	//文字列の長さを返すメソッド
	public static int calculateStringLength(String word) {
		return word.length();
	}

}
