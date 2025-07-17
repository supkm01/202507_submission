package week1_RANMINWEN;

public class Practice1 {

	public static void main(String[] args) {
		// お腹の状態である「isHungry」という変数の初期化
		//０は空腹；１はお腹いっぱい
		int isHungry = 0;

		//食べ物である「food」という変数の初期化
		String food = "ハンバーグ";

		//挨拶をする
		System.out.println("こんにちは");

		//お腹の状態を判定する
		if (isHungry == 0) {
			//空腹である場合
			System.out.println("はらべこです");

			System.out.println(food + "をいただきます");

			System.out.println("ごちそうさまでした");

			//お腹いっぱい場合
		} else if (isHungry == 1) {
			System.out.println("お腹がいっぱいです");

			System.out.println("ごちそうさまでした");
		}

	}

}
