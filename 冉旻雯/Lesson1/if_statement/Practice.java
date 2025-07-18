package lesson_3.if_statement;

public class Practice {

	public static void main(String[] args) {
		// 変数の初期化
		int a = 5;
		int b = 8;

		// aとbを比較して、大きい方または等しいかを表示
		if (a > b) {
			System.out.println(a + "が大きいです");
		} else if (b > a) {
			System.out.println(b + "が大きいです");
		} else {
			System.out.println("2つの数は等しいです");
		}


	}

}
