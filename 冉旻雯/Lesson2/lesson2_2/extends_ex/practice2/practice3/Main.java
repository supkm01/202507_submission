package lesson2_2.extends_ex.practice3;

public class Main {

	public static void main(String[] args) {
		//インスタンスを2つ作成します。
		Student alice = new Student("Alice", 20);
		Student bob = new Student("Bob", 19);
		
		System.out.println(alice.study());
		System.out.println(bob.study());
	}

}
