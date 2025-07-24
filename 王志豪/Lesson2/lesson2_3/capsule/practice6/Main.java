package lesson2_3.capsule.practice6;

public class Main {

	public static void main(String[] args) {
		//Quizクラスのインスタンス作成（引数："最も面積の広い都道府県はどこですか？"）
		Quiz q1 = new Quiz("最も面積の広い都道府県はどこですか？");
		// String配列を初期化（初期値："青りんご", "さくらんぼ", "みかん", "ぶどう"）
		String[] answers = { "青りんご", "さくらんぼ", "みかん", "ぶどう" };
		
		Quiz q2 = new MultipleChoiceQuiz("赤色の果物はどれですか", answers);
		Quiz q3 = new BlankQuiz("(      )は(     )年に鎌倉幕府を設立した。", 2);

		QuizViwer.showQuiz(q1);
		QuizViwer.showQuiz(q2);
		QuizViwer.showQuiz(q3);

	}

}
