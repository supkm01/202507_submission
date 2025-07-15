package lesson1_2.array;

public class Array2D {

	public static void main(String[] args) {
		int[][] allScores = new int[2][3];
		allScores[0][1]= 30;
		System.out.println(allScores[0][1]);
		
		// 二次元配列の初期化
		int[][] array2D = {{1,2,3},{8,10,12}};
		System.out.println(array2D[1][1]);
	}

}
