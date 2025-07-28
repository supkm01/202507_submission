package lesson3_2.map_ex;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		//マップの宣言
		Map<String,Integer> students= new HashMap <String,Integer>();
		//データの挿入
		students.put("Alice", 80);
		students.put("Bob", 100);
		students.put("Carol", 30);
		System.out.println(students);
		
		//取得
		System.out.println(students.get("Bob"));
		//データの削除
		students.remove("Alice");
		System.out.println(students);
		
		//
		for(String data: students.keySet()) {
			//key
			System.out.println("Key: " + data);
			//value
			System.out.println("value: " + students.get(data));
		}
	}

}
