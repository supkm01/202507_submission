package lesson2_3.capsule.practice5;

public class Coupon {
	//メンバー変数
	//クーポンの名前を表すプロパティです。
	private String name;
	//割引率を表すプロパティです。0から1の範囲の値を持ち、0が割引なし、1が100%割引を意味します
	private double rate;

	//- パラメータ:
	//**`name`** (String): クーポンの名前を設定します。
	// **`rate`** (double): クーポンの割引率を設定します。
	public Coupon(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	//メソッド
	//クーポンの名前を取得します。
	public String getName() {
		return name;
	}

	//クーポンの名前を取得します。
	public void setName(String name) {
		this.name = name;
	}

	//クーポンの割引率を取得します。
	public double getRate() {
		return rate;
	}

	//クーポンの割引率を設定します。
	public void setRate(double rate) {
		this.rate = rate;
	}

}
