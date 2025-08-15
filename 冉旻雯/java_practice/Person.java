package java_practice;

//親クラス
public class Person {
	//メンバ変数
	protected String name;
	protected int age;

	//コンストラクタ
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//自己紹介を行う。
	public void introudce() {
		System.out.println(
				"My name is " + name + ". I am " + age + "years old.");
	}

}
