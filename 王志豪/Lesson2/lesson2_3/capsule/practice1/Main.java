package lesson2_3.capsule.practice1;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 60, 4);
		//「myCar」のブランド名を表示する。
		System.out.println("Brand: " + myCar.getBrand());
		//myCar」のドアの数を表示する。
		System.out.println("door: " + myCar.getNumDoors());
		//myCar」の速度を表示する。
		System.out.println("Speed: " + myCar.speed);
		//「myCar」の速度を20増やし、新しい速度を表示する。
		myCar.accelerate(20);
		System.out.println("accelerated Speed: " + myCar.speed);
		//「myCar」を鳴らす
		myCar.honk();
		
	}

}
