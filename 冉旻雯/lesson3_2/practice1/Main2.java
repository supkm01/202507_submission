package lesson3_2.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		//マップの宣言
		Map<String, Student> students = new HashMap<String, Student>();

		// キー：Alice バリュー：Aliceの全ての情報（名前、年齢、学籍番号）
		students.put("Alice", new Student("Alice", 19, 110120));
		// データの追加 ※キーは名前、バリューは生徒の情報
		students.put("Bob", new Student("Bob", 21, 110121));
		students.put("Carol",new Student("Carol", 20, 110122));
		students.put("Dave", new Student("Dave", 190, 110123));

		// キー「Alice」を指定して、Aliceの生徒の情報を表示する
		System.out.println(students.get("Alice" ));
		
	}

}
