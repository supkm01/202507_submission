package lesson3_2.stream_ex.practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// リスト宣言と代入
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("tanaka", 28));
		personList.add(new Person("suzuki", 22));
		personList.add(new Person("izawa", 32));

		//名前と年齢出力
		for (Person p : personList) {
			System.out.println(p.getName() + "は" + p.getAge() + "です。");
		}

		//出力
		System.out.println("１件目は" + personList.get(0).getName() + "さんです。");

		//
		personList.stream()
				.sorted((s1, s2) -> s2.getAge() - s1.getAge())
				.forEach(a -> System.out.println("名前：" + a.getName() + " 年齢：" + a.getAge()));

	}

}
