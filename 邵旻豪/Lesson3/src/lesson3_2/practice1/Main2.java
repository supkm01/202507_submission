package lesson3_2.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// Mapの宣言（Hashmap）
		Map<String, Object> students = new HashMap<String, Object>();

		// キー：Alice バリュー：Aliceの全ての情報（名前、年齢、学籍番号）
		// データの追加 ※キーは名前、バリューは生徒の情報
		students.put("Alice", new Student("Alice", 19, "110120"));

		// キー「Alice」を指定して、Aliceの生徒の情報を表示する
		System.out.println(students.get("Alice"));
	}

}
