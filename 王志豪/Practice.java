package lesson1_3.if_statement;

public class Practice {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		
		if (a > b) {
			//aの方が大きいの場合
			System.out.println(a + "の方が大きいです");
		} else if (b > a) {
			//bの方が大きいの場合
			System.out.println(b + "の方が大きいです");
		} else {
			//2つの数は等しいです
			System.out.println("2つの数は等しいです");
		}

	}

}
