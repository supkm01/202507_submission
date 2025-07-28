package lesson3_2.list_ex;

public class Cat {
	// メンバ変数
	// 名前:name
	// 年齢:age
	private String name;
	private int age;
	// コンストラクタ
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
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
	// toStringのオーバーライド	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}



	
}
