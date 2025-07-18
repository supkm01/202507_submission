package lesson2_1.Practic4;

//生徒の情報を扱うクラス
public class Student {
	//メンバ変数
	//名前
	String name;
	//国語の得点
	int japanese;
	//数学の得点
	int math;
	//英語の得点
	int english;
	

	//コンストラクタ
	public Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}
	
	//showメソッドを作成する
	void showScore() {
		System.out.println(this.name + ":" + japanese + "," + math);
	}
}
