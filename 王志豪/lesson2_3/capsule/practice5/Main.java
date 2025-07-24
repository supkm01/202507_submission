package lesson2_3.capsule.practice5;

public class Main {

	public static void main(String[] args) {
		Menber taro = new Menber("タロウ");
		Menber hanako = new Menber("ハナコ");

		Coupon silver = new Coupon("シルバー", 0.2);
		Coupon gold = new Coupon("ゴールド", 0.5);

		taro.setCoupon(silver);
		hanako.setCoupon(gold);

		//taroの持つuseCouponメソッドを呼び出します。引数は2000とします。
		//戻り値は、変数payを宣言して受け取ります。
		//実行結果になるようにコンソールに出力します。
		int pay = taro.useCoupon(2000);
		System.out.println("割り引け額が" + pay+ "円です。");
		//hanakoの持つuseCouponメソッドを呼び出します。引数は2000とします。
		//戻り値は、変数payを宣言して受け取ります。
		//実行結果になるようにコンソールに出力します。
		pay = hanako.useCoupon(2000);
		System.out.println("割り引け額が" + pay+ "円です。");

	}

}
