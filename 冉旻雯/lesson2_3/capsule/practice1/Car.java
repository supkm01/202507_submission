package lesson2_3.capsule.practice1;

//子クラス
//親クラス「Vehicle」を継承する。
public class Car extends Vehicle {
	//メンバ変数
	//車のドアの数
	private int numDoors;

	//コンストラクタ：
	public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}

	//車のドアの数を返す
	public int getNumDoors() {
		return numDoors;
	}
	//車のドアの数を設定
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	public void honk() {
		System.out.println("Honk honk");
	}
	

}
