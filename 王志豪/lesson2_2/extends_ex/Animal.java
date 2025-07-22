package lesson2_2.extends_ex;

//親クラス
public class Animal {
	//メンバー変数
	//名前
	String name;
	//年齢
	int age;
	
	//コンストラクタ
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//食べるメソッド
	void eat(String food) {
		System.out.println(food + "を食べる");
	}
	
	//鳴くメソッド
	void sounds() {
		System.out.println("鳴く");
	}
}
