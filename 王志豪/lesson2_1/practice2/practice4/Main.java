package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		//インスタンス配列
		Student[] student = new Student[2];
		//コンストラクタ
		student[0] = new Student("タロウ",80,75,90);
		student[1] = new Student("はなこ",90,70,80);
		
		//メソッド
		student[0].show();
		student[1].show();
	}

}
