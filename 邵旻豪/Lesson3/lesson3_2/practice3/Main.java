package lesson3_2.practice3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Mapの宣言
		Map<String, Integer> student = new HashMap<String, Integer>();
		//データの挿入
		student.put("Alice", 80);
		student.put("Bob", 65);
		student.put("Carol", 90);
		student.put("Dave", 55);
		student.put("Eve", 70);
		//平成点計算
		int num = 0;
		for (String data : student.keySet()) {
			num += student.get(data);
		}
		int averagescore = num / student.size();
		//出力
		System.out.println("平均点: " + averagescore);
		System.out.println("平均点以上の生徒:");
		for (String data : student.keySet()) {
			int sore = student.get(data);
			if (sore > averagescore) {
				System.out.println(data);
			}
		}

	}

}
