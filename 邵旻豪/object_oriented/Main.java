package lesson2_1.object_oriented;

public class Main {

	public static void main(String[] args) {
		//インスタンス作成
		Dog bob = new Dog();
		//名前
		bob.name = "BOB";
		//年齢：3
		bob.age = 3;

		System.out.println(bob.name);
		System.out.println(bob.age);

		// メソッドの呼び出し
		bob.eat("フード");

	}

}
