package lesson3_2.stream_ex.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// Mapの宣言
		Map<String, Person> personMap = new HashMap<>();
		//データの挿入
		personMap.put("田中", new Person("tanaka", 28));
		personMap.put("鈴木", new Person("suzuki", 25));
		personMap.put("井澤", new Person("izawa", 32));

		for (String data : personMap.keySet()) {
			if ("井澤".equals(data)) {
				System.out.println("井澤はいます");
			} else {
				System.out.println("井澤はいません");
			}
		}
	}
}
