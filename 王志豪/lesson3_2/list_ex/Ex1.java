package lesson3_2.list_ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		// Lsit宣言
		List<String> studentName = new ArrayList<String>();
		//データ挿入
		studentName.add("Alice");
		studentName.add("Bob");
		studentName.add("Carol");
		//要素を指定して追加
		studentName.add(3, "add");
		//データの削除
		studentName.remove(3);
		studentName.remove("Alice");
		//データの所得
		System.out.println(studentName.get(0));
		//データの上書き
		studentName.set(0, "Kitty");
		//要素の個数の所得
		System.out.println(studentName.size());

		// 不可変なリスト
		//				List<String> name = List.of("Taro", "Hana");
		//				name.add("Jiro");
		//				List<String> name2 = new ArrayList<String>(List.of("Taro", "Hana"));
		//				name2.add("Jiro");
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		System.out.println(nums.get(0));
	}

}
