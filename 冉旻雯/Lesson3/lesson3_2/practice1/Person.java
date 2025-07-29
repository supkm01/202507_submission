package lesson3_2.stream_ex.practice1;

public class Person {
	//メンバ変数
	//名前
	private String name;
	//年齢
	private int age;

	//コンストラクタ
	Person(String name, int age) {
		super();
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

	//toStringのオーバーライド	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
