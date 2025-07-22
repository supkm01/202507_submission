package lesson2_1.practice5;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成（1つ）
		// コンストラクタに渡す値：8.0, 4.0, 10.0

		// メソッドを呼び出してコンソールに面積を表示する
		// 実行結果「36.0」
		
		//コンストラクタで初期化する
		Daikei daikei1 = new Daikei(8.0,4.0,10.0);
		//面積を出力する
		System.out.println("台形の面積：" + daikei1.getArea());
		

	}

}
