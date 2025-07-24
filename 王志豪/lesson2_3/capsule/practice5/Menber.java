package lesson2_3.capsule.practice5;

public class Menber {
	//プロパティ
	String name;
	Coupon coupon;

	//コンストラクタ
	public Menber(String name) {
		this.name = name;
	}

	//メソッド
	public int useCoupon(int price) {
		return (int) (price * coupon.rate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

}
