package lesson2_3.capsule.practice3;

public class Person {
	//メンバ変数
	private String name;
	protected int age;

	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//メソッド
	public void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}

}
