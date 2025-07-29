package lesson3_2.practice3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//マップの宣言
		Map<String, Integer> students = new HashMap<String, Integer>();

		//データの挿入
		students.put("Alice", 80);
		students.put("Bob", 65);
		students.put("Carol", 90);
		students.put("Dave", 55);
		students.put("Eve", 70);

		//すべての生徒の平均点を計算する
		//合計点数
		int sum = 0;
		for (String data : students.keySet()) {
			sum = sum + students.get(data);
		}
		//平均点数
		int average = sum / students.size();
		System.out.println("平均点:" + average);

		//平均点以上の点数をとった生徒
		System.out.println("平均点以上の生徒:");

		for (String data : students.keySet()) {
			if (students.get(data) < average) {
				students.remove("key:");
			} else {
				System.out.println(data);
			}

		}

	}

}
