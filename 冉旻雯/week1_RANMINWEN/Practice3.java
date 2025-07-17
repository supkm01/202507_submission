package week1_RANMINWEN;

public class Practice3 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] array = new int[] { 5, 3, 9, 1, 7 };

		//メソッドを呼び出す
		int max = findMax(array);
		System.out.println("Maximum value in the array:" + max);

	}

	//最大値の探す
	public static int findMax(int[] array) {
		int max = array[0];
		if (max < array[0]) {
			max = array[0];
		}
		if (max < array[1]) {
			max = array[1];
		}
		if (max < array[2]) {
			max = array[2];
		}
		if (max < array[3]) {
			max = array[3];
		}
		if (max < array[4]) {
			max = array[4];
		}
		return max;

	}

}
