package lesson2_2.extends_ex.practice3;

public class Student extends Person implements Subject {

	//スーパークラスのコンストラクタを呼び出し
	public Student(String name, int age) {
		super(name, age);
	}

	public void study() {
		System.out.println(name + "が勉強中です。");
	}
}
