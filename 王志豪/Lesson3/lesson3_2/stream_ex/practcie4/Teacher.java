package lesson3_2.stream_ex.practcie4;

public class Teacher {
	// メンバ変数
	private String name;
	private int age;

	// コンストラクタ
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// get setメソッド
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

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

	//
	
}
