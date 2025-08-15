package java_practice;

public class Person {
	//メンバー変数
//	- protected修飾子を持つString型の「name」フィールド：人の名前を格納する。
	protected String name;
//	- protected修飾子を持つint型の「age」フィールド：人の年齢を格納する。
	protected int age;
	//コンストラクタ
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}


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


	//- メソッド：
//- 「introduce()」メソッド：自己紹介を行う。コンソールに「My name is [name]. I am [age] years old.」と表示する。
	public void introduce() {
		System.out.println("My name is "+getName()+". I am "+getAge()+"years old." );
	}

}
