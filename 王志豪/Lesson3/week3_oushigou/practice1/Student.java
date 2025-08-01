package week3_oushigou.practice1;

public class Student {
	// メンバ変数
	private String name;
	private int age;
	private int score;

	// コンストラクタ
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// getter setterメソッド
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

	// toStringメソッド
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

}
