package lesson2_1.practice2;

public class Main {

	public static void main(String[] args) {
		// 以下を引数にしてインスタンスを2つ作成する
		// 「Taro 75」
		// 「Hana 80」
		
		// showScoreメソッドを2回呼び出してください。
		// 実行結果
		// Taroさんの得点は75点です。
		// Hanaさんの得点は80点です。
		
		//コンストラクタで学生の情報導入する
		Student Taro = new Student("Taro",75);
		Student Hana = new Student("Hana",80);
		
		// showScoreメソッドを2回呼び出す。
		Taro.showScore();
		Hana.showScore();

	}

}
