package lesson2_3.capsule.practice6;

public class Quiz {
	//フィールド
	protected String main;

	//コンストラクタ
	public Quiz(String main) {
		this.main = main;
	}

	//メソッド
	void displayHeader() {
		System.out.println("「次の問いに答えなさい」");
	}

	void displayMain() {
		System.out.println(main);
	}

}
