package lesson2_1.practice5;

public class Main {

	public static void main(String[] args) {

		// インスタンス作成（1つ）
		// コンストラクタに渡す値：8.0, 4.0, 10.0
		Daikei daikei1 = new Daikei(8.0, 4.0, 10.0);
		// メソッドを呼び出してコンソールに面積を表示する
		System.out.println(daikei1.getArea());
		// 実行結果「36.0」
	}

}
