package lesson2_2.extends_ex;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Cat alice = new Cat("Alice",10,"黒");
		System.out.println(alice.name);
		alice.eat("キャットフード");
		
		// Dogクラスのインスタンスを作成(引数は適当)
		Dog dog1 = new Dog("dog1" ,2,"黄色");
		
		// Animalクラスの振る舞い(eatメソッド)を呼び出し
		dog1.eat("肉まん");
		// Dogクラスの色を表示
		System.out.println(dog1.color);
		
	}

}
