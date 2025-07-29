package lesson3_2.stream_ex.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Listの宣言
		List<String> lists = new ArrayList<String>();
		//データの挿入
		lists.add("apple");
		lists.add("banana");
		lists.add("cherry");
		lists.add("date");
		lists.add("elderberry");
		lists.add("fig");
		lists.add("grape");

		//Stream APIを使用して、リストから長さが5文字以上かつ最初の文字が'e'ではない文字列だけ抽出します。
		lists.stream()
				.filter(a -> a.length() >= 5)
				.filter(s -> s.startsWith("e") == false)
				//リストの全要素を表示します。
				.forEach(i -> System.out.println(i));

	}

}
