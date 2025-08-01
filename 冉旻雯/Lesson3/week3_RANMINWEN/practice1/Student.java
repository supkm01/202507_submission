package week3_RANMINWEN.practice1;

public class Student {
	//メンバ変数
	//名前
	private String name;
	//年齢
	private int age;
	//点数
	private int score;

	//コンストラクタ
	Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}
