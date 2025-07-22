package lesson2_1.practice2;

public class Student {

	//メンバ変数
	//名前を表す
	String name;
	//得点を表す
	int score;

	//コンストラクタを作成する。引数：String name, int score
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//showScore メソッドを作成する。
	void showScore() {
		System.out.println(name + "さんの得点は" + score + "点です");
	}

}
