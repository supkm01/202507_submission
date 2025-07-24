package lesson2_1.practice2;

public class Student {
	// メンバ変数
	// 学生名前
	String name;
	//得点
	int score;

	// コンストラクタ
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	//showScore メソッドを作成する。
	void showScore() {
		System.out.println(this.name + "さんの得点は" + score + "円点です。");
	}

	/**
	 * 	Student クラスは生徒を管理するクラスです。
		次のフィールド、メソッド、コンストラクタを作成してください。
	    ・フィールド（メンバ変数）を作成する。
		  ・名前を表す name を String 型で宣言する
		  ・得点を表す score を int 型で宣言する
		・コンストラクタを作成する。
		  引数：String name, int score
		  処理内容：引数を使ってメンバ変数を初期化する。
		・showScore メソッドを作成する。
		  引数：なし
		  戻り値：なし
		  処理内容：フィールドを用いて「name さんの得点は score 点です。」と表示する。
	 */
}
