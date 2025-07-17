package week1_oushigou;

public class Practice3 {

	public static void main(String[] args) {
		//配列の初期化
		int array[] = { 5, 3, 9, 1, 7 };

		//最大値を捜すためのメソッドを使う
		System.out.println("Maximum value in the array:" + findMax(array));

	}

	// 配列から最大値を求めるメソッド
	public static int findMax(int[] arrays) {
		//最初の要素を仮の最大値とします。
		int max = arrays[0];

		//より大きいの値が見つかったら、maxに代入する
		for (int i = 1; i < arrays.length; i++) {
			if (arrays[i] > max) {
				max = arrays[i];
			}
		}

		//最大値を出力する
		return max;

	}

}
