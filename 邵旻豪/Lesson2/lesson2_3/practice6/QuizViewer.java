package lesson2_3.capsule.practice6;

public class QuizViewer {
	//メンバー変数
	//問題番号を表すcountをint型で定義します。
	private static int count=0;

	public static void showQuiz (Quiz quiz) {
		++count;
		System.out.println("<第"+count+"問>");
			quiz.displayHeader();
			quiz.displayMain();
		}
		
	}


