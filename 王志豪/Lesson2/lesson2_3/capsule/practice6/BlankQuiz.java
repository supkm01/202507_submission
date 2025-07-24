package lesson2_3.capsule.practice6;

public class BlankQuiz extends Quiz {
	//フィールド
	int blankCount;
	//コンストラクタ

	public BlankQuiz(String main, int blankCount) {
		super(main);
		this.blankCount = blankCount;
	}

	//メソッド
	void displayHeader() {
		System.out.println("「次の文の空欄を埋めなさい。」");
	}

	void displayMain() {
		System.out.println(super.main);
		for (int i = 0; i < blankCount; i++) {
			System.out.println(i + 1 + ":______________");
		}

	}

}
