package lesson2_1.practice4;

public class Student {
	//メンバー変数
	String name;
	int japanese;
	int math;
	int english;

	//コンストラクタ①を作成する
	public Student(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	void show() {
		//		System.out.println("名前："+name+"国語："+japanese+"、数学："+math+"英語："+english);
		System.out.println(name + "：" + japanese + "," + math + "," + english);
	}

}
