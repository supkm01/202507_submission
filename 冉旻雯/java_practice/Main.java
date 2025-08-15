package java_practice;

public class Main {

	public static void main(String[] args) {
		// 生徒のインスタンスを作成
		Student taro = new Student("Taro", 20, "20230001");

		//自己紹介させる。
		taro.introudce();
		//
		taro.run();

		//車のインスタンスを作成
		Car toyota = new Car("Toyota");
		//車のインスタンスで「run()」メソッドを呼び出す
		toyota.run();
		//車のブランド名を表示
		System.out.println(
				"The brand name of the car is " + toyota.getBrand());

	}

}
