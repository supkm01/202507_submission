package lesson2_2.extends_ex;

public class Dog extends Animal{
	// Animalクラスを継承
	// String color をメンバ変数(犬クラス独自)として宣言
	// color(犬クラス独自)にも値が代入できるようにする
	String color = "白";
	

	// コンストラクタを作成して、親クラスのname,ageに値を設定できるようにする
	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	

}
