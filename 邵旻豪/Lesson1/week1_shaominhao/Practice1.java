package week1_shaominhao;

public class Practice1 {

	public static void main(String[] args) {
		// 変数の初期化
		int isHungry = 1;
		String food = "ハンバーグ";
		//こんにちはを表示する
		System.out.println("こんにちは");

		//空腹とお腹がいっぱいの場合の実行結果を表示する
		if (isHungry == 1) {
			System.out.println("お腹いっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}
		//ごちそうさまでしたを表示する
		System.out.println("ごちそうさまでした");
	}

}
