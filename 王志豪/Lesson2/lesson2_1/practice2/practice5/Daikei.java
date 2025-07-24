package lesson2_1.practice5;

public class Daikei {
	// メンバ変数
	// double型の上底「top」,高さ「height」,下底「low」

	// コンストラクタ
	// 引数：メンバ変数すべて
	// 引数を使ってメンバ変数すべてを初期化する。

	// 面積計算メソッド:getArea
	// 引数なし、戻り値のデータ型double
	// 台形の面積を計算して結果を返す（面積 = (上底 + 下底) × 高さ × 0.5）
	double top;
	double height;
	double low;
	public Daikei(double top, double height, double low) {
		this.top = top;
		this.height = height;
		this.low = low;
	}
	double getArea() {
		return (top + low) * height / 2 ;
	}
}
