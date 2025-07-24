package lesson2_3.capsule.practice1;
//親クラス
public class Vehicle {
	//車のブランド名
	private String brand;
	//車の速度
	protected int speed;

	//コンストラクタ
	public Vehicle(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}

	//getter setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	//速度を増やす
	public int accelerate(int amount) {
		return speed + amount;
		}
	//速度を減らす
	public int brake(int amount){
		return speed - amount;
	}

}