package lesson2_3.capsule.practice6;

//Quizクラスを継承し
public class MultipleChoiceQuiz extends Quiz {
	//メンバー変数
	//選択肢を表すanswersをString型の配列で定義します。
	public String[] answers;

	//コンストラクタの作成
	public MultipleChoiceQuiz(String main, String[] answers) {
		super(main);
		this.answers = answers;
	}

	//displayHeaderメソッドの作成
	@Override
	public void displayHeader() {
		System.out.println("「次の問いについて、正しいものを４つの中から選びなさい」");
	}

	//displayMainメソッドの作成
	@Override
	public void displayMain() {
		System.out.println(main);
		for (int i = 0; i < answers.length; i++) {
			System.out.println((i + 1) + ":" + answers[i]);
		}
	}
}
