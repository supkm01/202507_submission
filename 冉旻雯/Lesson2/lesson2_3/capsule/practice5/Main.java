package lesson2_3.capsule.practice5;

public class Main {

	public static void main(String[] args) {
		Member taro = new Member("タロウ");
		Member hanako = new Member("ハナコ");

		Coupon silver = new Coupon("シルバー", 0.2);
		Coupon gold = new Coupon("ゴールド", 0.5);

		taro.setCoupon(silver);
		hanako.setCoupon(gold);

		//taroの持つuseCouponメソッドを呼び出します。引数は2000とします。
		taro.useCoupon(2000);
		//戻り値は、変数payを宣言して受け取ります。
		
		//実行結果になるようにコンソールに出力します。

		
		//hanakoの持つuseCouponメソッドを呼び出します。引数は2000とします。
		hanako.useCoupon(2000);
		//戻り値は、変数payを宣言して受け取ります。
		
		//実行結果になるようにコンソールに出力します。

	}

}
