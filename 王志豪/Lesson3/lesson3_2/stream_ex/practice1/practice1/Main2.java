package lesson3_2.stream_ex.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {

		//map宣言と代入
		Map<String, Person> personMap = new HashMap<String, Person>();
		personMap.put("田中", new Person("tanka", 28));
		personMap.put("鈴木", new Person("suzuki", 25));
		personMap.put("井澤", new Person("izawa", 32));

		//井澤がいるかどうか
		if (personMap.containsKey("井澤")) {
			System.out.println("井澤はいます。");
		} else {
			System.out.println("井澤はいません。");
		}
		
		//名前と年齢を出力する
		for(String name:personMap.keySet()) {//
			System.out.println(name + "は"+ personMap.get(name).getAge() + "歳");
		}
		
		//math
		

	}

}
