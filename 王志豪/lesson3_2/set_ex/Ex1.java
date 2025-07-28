package lesson3_2.set_ex;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		//セットの宣言
		Set<String> names = new HashSet<String>();
		
		//データの挿入
		names.add("Alice");
		names.add("Bob");
		names.add("Carol");
		names.add("Alice");
		System.out.println(names);
		
		//集合の中に指定したデータがあるかどうかを確認する
		System.out.println(names.contains("Bob"));
	}

}
