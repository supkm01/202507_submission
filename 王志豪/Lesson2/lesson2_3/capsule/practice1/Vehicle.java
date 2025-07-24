package lesson2_3.capsule.practice1;

public class Vehicle {
	//メンバ変数
	private String brand;
	protected int speed;
	//コンストラクタ
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	//get set メソッド
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//メソッド
	protected void accelerate(int amount) {
		speed += amount;
	}
	protected void brake(int amount) {
		speed -= amount;
	}
	
	

}
