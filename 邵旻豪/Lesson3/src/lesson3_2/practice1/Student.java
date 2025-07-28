package lesson3_2.practice1;

public class Student {
	//メンバー変数
	//名前
	private String name;
	//年齢
	private int age;
	//学籍番号
	private String id;

	//コンストラクタ
	public Student(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	//get set
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
