package lesson2_1.practice4;

public class Student {
	//メンバー変数
	String name;
	int japanese;
	int math;
	int english;

	//コンストラクタ
	public Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	//メソッド
	void show() {
		System.out.println("名前：" + name + " " + japanese + "," + math + "," + english);
	}

}
