package lesson1_3.if_statement;

public class Practice2 {

	public static void main(String[] args) {
		// 変数の初期化
		//三角形の3辺の長を定義する
		int a=2;
		int b=2;
		int c=2;
		//三角形のどれであるかを判定し、結果を出力する
	     if(a==b&&a==c&&b==c) {
		System.out.println("正三角形です");
		}else if (a==b||a==c||b==c) {
			System.out.println("二等辺三角形です");
		}else{
			System.out.println("不等辺三角形です");
		}
		
	}

}
