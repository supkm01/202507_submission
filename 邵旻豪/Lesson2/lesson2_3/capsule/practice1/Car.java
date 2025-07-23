package lesson2_3.capsule.practice1;

//親クラス「Vehicle」を継承する。
public class Car extends Vehicle {
	//メンバー変数
	//車のドアの数を格納する。
	private int numDoors;

	//コンストラクタ
	public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}

	//「getNumDoors()」メソッド：車のドアの数を返す。
	public int getNumDoors() {
		return numDoors;
	}

	//「setNumDoors()」メソッド：引数として受け取った「numDoors」をフィールドに設定する。
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	//「honk()」メソッド：コンソールに「Honk honk!」と表示する。
	void honk() {
		System.out.println("Honk honk!");
	}

}
