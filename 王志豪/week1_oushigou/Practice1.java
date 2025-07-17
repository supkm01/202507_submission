package week1_oushigou;

public class Practice1 {

	public static void main(String[] args) {
		//int型の変数isHungryを定義します。0が空腹1が満腹とします。
		//String型の変数foodを定義します。食べ物の名前はつけ麵。
		int isHungry = 0;
		String food = "つけ麵";

		//こんにちはと表示します。
		System.out.println("こんにちは");

		//もし変数isHungryが1であれば「お腹がいっぱいです」と表示します。
		//そうでなければ、「はらペコです」、「変数foodをいただきます」と表示します。
		if (isHungry == 1) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらペコです");
			System.out.println(food + "をいただきます。");
		}

		//最後にごちそうさまと表示します。
		System.out.println("ごちそうさま");

	}

}
