package lesson2_1.practice5;

public class Daikei {
	// メンバ変数
	// double型の上底「top」,高さ「height」,下底「low」
	double top;
	double heigith;
	double low;

	// コンストラクタ
	// 引数：メンバ変数すべて
	// 引数を使ってメンバ変数すべてを初期化する。

	public Daikei(double top, double heigith, double low) {
		super();
		this.top = top;
		this.heigith = heigith;
		this.low = low;
	}

	// 面積計算メソッド:getArea
	// 引数なし、戻り値のデータ型double
	// 台形の面積を計算して結果を返す（面積 = (上底 + 下底) × 高さ × 0.5）

	double getArea() {
		double result = (top + low) * heigith * 0.5;
		return result;
	}

}
