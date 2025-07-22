package lesson2_2.extends_ex.practcie1;

public class Vehicle {
	//	Vehicleクラス（親クラス）
	//	・メンバ変数：String brand
	String brand;
	//	・コンストラクタを用意

	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	//	・メソッド
	//	　displayBrand：戻り値なし、パラメータなし
	void displayBrand() {
		System.out.println("ブランドは：" + brand);
	}
	//	　変数名(brand)に設定されたブランド名を コンソールに表示
	
}
