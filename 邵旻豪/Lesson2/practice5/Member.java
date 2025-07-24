package lesson2_3.capsule.practice5;

public class Member {
	//メンバー変数
	//会員の名前を表すプロパティです。
	private String name;
	//会員が所持するクーポン情報を表すプロパティです。
	private Coupon coupon;

	// 会員の名前を設定します。
	public Member(String name) {
		super();
		this.name = name;
	}

	//メソッド
	//クーポンを使用して割引価格を計算します。
	public int useCoupon(int price) {
		double result = price * coupon.getRate();
		return (int) result;
	}

	//会員の名前を取得します。
	public Coupon getName() {
		return name;
	}

	//会員の名前を設定します
	public void setName(Coupon name) {
		this.name = name;
	}

	//会員が所持するクーポン情報を取得します。
	public Coupon getCoupon() {
		return coupon;
	}

	//会員にクーポン情報を設定します。
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

}
