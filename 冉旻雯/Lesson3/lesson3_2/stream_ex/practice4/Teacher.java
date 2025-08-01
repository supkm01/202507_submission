package lesson3_2.stream_ex.practice4;

public class Teacher {
	//メンバ変数
	//名前
	private String name;
	//年齢
	private int age;

	//コンストラクタ
	Teacher(String name, int age) {
		this.name = name;
		this.age = age;
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

	//toString
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

}
