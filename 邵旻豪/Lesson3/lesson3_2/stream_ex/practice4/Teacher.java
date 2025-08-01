package lesson3_2.stream_ex.practice4;

public class Teacher {
	//メンバ変数
	//・String型のname
	private String name;
	//int型のage
	private int age;

	//コンストラクタ
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//get set , toString

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

}
