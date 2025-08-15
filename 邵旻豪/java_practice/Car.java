package java_practice;

public class Car implements Runnable {
	//メンバー変数

	//    - private修飾子を持つString型の「brand」フィールド：車のブランド名を格納する。
	private String brand;
	//コンストラクタ：

	public Car(String brand) {
		this.brand = brand;
	}
//	- メソッド：
//  - 「run()」メソッド（インタフェース「Runnable」の実装）：車が走る操作を表現する。コンソールに「[brand] cars on the road.」と表示する。
	
	@Override
	public void run() {
		System.out.println(brand+" cars on the road");
		
	}
//  - 「getBrand()」メソッド：車のブランド名を取得する。
	
	public String getBrand() {
		return brand;
	}
//  - 「setBrand()」メソッド：引数として受け取った「brand」をフィールドに設定する。
	public void setBrand(String brand) {
		this.brand = brand;
	}
	



}
