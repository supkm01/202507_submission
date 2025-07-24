package lesson2_3.capsule.practice6;

public class QuizViwer {
	//フィールド
	public static int count;

	//
	public static void showQuiz(Quiz quiz) {
		count++;
		System.out.println("「<第" + count + "問>」");
		quiz.displayHeader();
		quiz.displayMain();
		System.out.println();
	}

}
