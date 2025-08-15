package java_practice;

public class Car implements Runnable{
	//メンバ変数
	//車のブランド名
	private String brand;
	
	//コンストラクタ
	Car(String brand) {
		this.brand = brand;
	}
	
	//インタフェースの実装
	@Override
	public void run() {
		System.out.println(
				brand + "cars on the road.");
	}
	
	//getter setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
