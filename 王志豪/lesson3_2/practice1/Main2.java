package lesson3_2.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// Mapの宣言（HashMap）
		// キー：Alice バリュー：Aliceの全ての情報（名前、年齢、学籍番号）
		Map<String, String> students = new HashMap<String, String>();
		// データの追加 ※キーは名前、バリューは生徒の情報
		students.put("Alice", "age=19, Id=110120");
		students.put("Bob", "age=21, Id=110121");
		students.put("Carol", "age=20, Id=110122");
		students.put("Dave", "age=19, Id=110123");
		// キー「Alice」を指定して、Aliceの生徒の情報を表示する
		System.out.println("name:" + "Alice " + students.get("Alice"));

	}

}
