package lesson1_3.if_statement;

public class Practice2 {

	public static void main(String[] args) {
		// 変数の初期化
		int a = 5;
		int b = 5;
		int c = 10;
		
		// a、bとcを比較して、等しいかを確認する。
		if( a == b && a == c)  {
			System.out.println("正三角形です");
		}else if( a != b ) {
			if( a == c || c ==b) {
			System.out.println("二等辺三角形");
			}else {
			System.out.println("不等辺三角形です");
		}
			}
	}

}
