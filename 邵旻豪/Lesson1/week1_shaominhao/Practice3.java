package week1_shaominhao;

public class Practice3 {

	public static void main(String[] args) {
		// 変数の初期化
		int[] array = { 5, 3, 9, 1, 7 };
		//メソッドを呼び出し、結果を出力
		System.out.println("Maximum value in the array:" + findMax(array));
	}

	//最大値を求めるメソッド
	public static int findMax(int[] arr) {
		int maxnum = 0, num;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			while (maxnum < num) {
				maxnum = num;
			}
		}
		return maxnum;
	}

}
