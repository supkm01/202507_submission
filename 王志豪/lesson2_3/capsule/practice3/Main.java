package lesson2_3.capsule.practice3;

public class Main {

	public static void main(String[] args) {
		//初期化
		Student alice = new Student("Alice", 20, "12345");

		//内容を表示します。
		alice.introduce();
		System.out.println("学生ID：" + alice.getStudengtId());

	}

}
