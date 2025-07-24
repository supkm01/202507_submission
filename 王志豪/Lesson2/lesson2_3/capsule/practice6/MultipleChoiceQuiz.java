package lesson2_3.capsule.practice6;

public class MultipleChoiceQuiz extends Quiz {
	//フィールド
	String[] answers;

	//コンストラクタ
	public MultipleChoiceQuiz(String main, String[] answers) {
		super(main);
		this.answers = answers;
	}

	//メソッド
	void displayHeader() {
		System.out.println("「次の問いについて、正しいものを４つの中から選びなさい」");
	}

	void displayMain() {
		System.out.println(super.main);
		for (int i = 0; i < answers.length; i++) {
			System.out.println((i + 1) + ":" + answers[i]);
		}
	}
	//
}
