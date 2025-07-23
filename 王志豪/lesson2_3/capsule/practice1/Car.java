package lesson2_3.capsule.practice1;

public class Car extends Vehicle {
	//メンバ変数
	private int numDoors;

	//コンストラクタ
	public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}

	//get set メソッド

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}
	
	//メソッド
	public void honk() {
		System.out.println("Honk honk!");
	}

}
