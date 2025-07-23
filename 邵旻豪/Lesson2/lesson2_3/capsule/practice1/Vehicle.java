package lesson2_3.capsule.practice1;

public class Vehicle {
	//メンバー変数
	//車のブランド名を格納する。
	private String brand;
	//車の速度を格納する。
	protected int speed;

	//コンストラクタ
	public Vehicle(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}

	//「getBrand()」メソッド：車のブランド名を返す。
	public String getBrand() {
		return brand;
	}

	//「setBrand()」メソッド：引数として受け取った「brand」をフィールドに設定する。
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//「accelerate(int amount)」メソッド：引数として受け取った「amount」だけ速度を増やす。
	public void accelerate(int amount) {
		speed = speed + amount;
	}

	//「brake(int amount)」メソッド：引数として受け取った「amount」だけ速度を減らす。
	public void brake(int amount) {
		speed = speed - amount;
	}

}
