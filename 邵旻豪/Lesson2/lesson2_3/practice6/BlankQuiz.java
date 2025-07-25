package lesson2_3.capsule.practice6;

//Quizクラスを継承
public class BlankQuiz extends Quiz {
	//メンバー変数
	//空欄の数
	private int blankCount;

	//コンストラクタ
	public BlankQuiz(String main, int blankCount) {
		super(main);
		this.blankCount = blankCount;
	}

	//displayHeaderメソッドの作成
	@Override
	public void displayHeader() {
		// 問題の冒頭文を表示します。
		System.out.println("「次の文の空欄を埋めなさい。」");
	}

	//displayMainメソッドの作成
	@Override
	public void displayMain() {
		// 問題の本文を表示します。
		for (int i = 0; i < blankCount; i++) {
			System.out.println((i + 1) + ":. __");
		}
	}

}
