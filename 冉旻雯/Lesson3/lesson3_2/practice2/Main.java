package lesson3_2.stream_ex.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//リストの宣言
		List<String> furits = new ArrayList<String>();
		
		//データの挿入
		furits.add("apple");
		furits.add("banana");
		furits.add("cherry");
		furits.add("date");
		furits.add("elderberry");
		furits.add("fig");
		furits.add("grape");
		
		//結果を表示します
		//リストから長さが5文字以上
		//最初の文字が'e'
		System.out.println(
		furits.stream()
		.filter(e -> e.length() >5)
		.filter(e -> e.startsWith("e"))
		.collect(Collectors.toList()));
		
	}

}
