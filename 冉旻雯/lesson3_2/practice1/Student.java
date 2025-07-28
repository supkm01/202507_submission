package lesson3_2.practice1;

public class Student {
	// メンバ変数
	// 名前
	private String name;
	// 年齢
	private int age;
	//学号
	private int Id;

	//コンストラクタ
	Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		Id = id;
	}

	// getter,setter
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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

}
