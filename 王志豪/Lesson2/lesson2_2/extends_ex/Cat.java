package lesson2_2.extends_ex;

public class Cat extends Animal {
	// メンバ変数(猫クラス独自のメンバ変数)
	//色
	String color;

	//コンストラクタ
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	// メソッド（猫独自）
	void meow() {
		System.out.println("ニャー");
	}
}
