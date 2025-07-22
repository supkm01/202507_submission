package lesson2_2.extends_ex.practice1;

//Carクラス（子クラス）
//・Vehicleクラスを継承
public class Car extends Vehicle {
	//	・メンバ変数は無し
	//	・コンストラクタ
	public Car(String brand) {
		super(brand);
	}

	//	・Carクラス独自のメソッド
	//	　drive：戻り値なし、パラメータなし
	//	　”car is driving” という文言をコンソールに表示
	void drive() {
		System.out.println("car is driving");
	}

}
