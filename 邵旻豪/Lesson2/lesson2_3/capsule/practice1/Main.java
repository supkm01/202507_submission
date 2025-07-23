package lesson2_3.capsule.practice1;

public class Main {

	public static void main(String[] args) {
		//Carクラスのインスタンス「myCar」を作成し、引数として「Toyota」、「60」、「4」を渡す。
		Car myCar = new Car("Toyota", 60, 4);
		//「myCar」のブランド名を表示する。
		System.out.println("Brand:" + myCar.getBrand());
		//「myCar」のドアの数を表示する。
		System.out.println("Number of doors: " + myCar.getNumDoors());
		//「myCar」の速度を表示する。
		System.out.println("Speed:" + myCar.speed);
		//「myCar」の速度を20増やし
		myCar.accelerate(20);
		//、新しい速度を表示する。
		System.out.println("New Speed:" + myCar.speed);
		myCar.honk();

	}

}
