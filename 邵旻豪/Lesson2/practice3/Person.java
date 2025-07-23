package lesson2_3.capsule.practice3;

public class Person {
	//private修飾子を持つString型の **`name`** フィールド：人物の名前を格納する。
	private String name;
	//protected修飾子を持つint型の **`age`** フィールド：人物の年齢を格納する。
	protected int age;

	//コンストラクタ:
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//メソッド: 名前と年齢をコンソールに表示する。
	public void introduce() {
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
	}

}
