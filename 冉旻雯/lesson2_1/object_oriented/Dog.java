package lesson2_1.object_oriented;

//設計書
public class Dog {
	// 属性（メンバ変数：登場人物に関する情報を保存する箱）
	// 名前
	String name;
	// 年齢
	int age;

	// 食べるメソッド
	void eat(String food) {
		// コンソール出力「food　を食べます」
		System.out.println(food + "を食べます");

	}
}
