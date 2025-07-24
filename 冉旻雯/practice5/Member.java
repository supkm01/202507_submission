package lesson2_3.capsule.practice5;

public class Member {
	//会員の名前
	String name;

	//会員が所持するクーポン情報
	private void Coupon() {
	};

	//コンストラクタ
	public Member(String name) {
		this.name = name;
	}

	public int useCoupon(int price) {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coupon getCoupon() {
		this.Coupon();
		return getCoupon();
	}

	public void setCoupon(Coupon coupon) {

	}
}