package lesson2_3.capsule.practice5;

//クーポン情報 仕様書
public class Coupon {
	//クーポンの名前
	String name;
	//割引率
	double rate;

	//コンストラクタ
	public Coupon(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	//クーポンの名前を取得
	public String getName() {
		return name;
	}

	//クーポンの名前を設定
	public void setName(String name) {
		this.name = name;
	}

	//クーポンの割引率を取得
	public double getRate() {
		return rate;
	}

	//クーポンの割引率を設定
	public void setRate(double rate) {
		this.rate = rate;
	}

}
