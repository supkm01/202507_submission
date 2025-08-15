package java_practice;

public class Main {

	public static void main(String[] args) {
//		- 生徒のインスタンスを作成する。（引数：`"Taro", 20, "20230001"`）
		Student student=new Student("Taro", 20, "20230001");
//		- 自己紹介させる。（introduce()メソッドを呼び出す）
		student.introduce();
//		- 生徒のインスタンスで「run()」メソッドを呼び出す。
		student.run();
//		- 車のインスタンスを作成する。（引数：`"Toyota"`）
		Car car=new Car("Toyota");
//		- 車のインスタンスで「run()」メソッドを呼び出す。
		car.run();
//		- 実行結果の通りになるように、車のブランド名を表示する。
		System.out.println("The brand name of the car is "+car.getBrand());
	}

}
