package lesson3_2.stream_ex.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Person> personList = new ArrayList<Person>();
		//値を対入
		personList.add(new Person("tanaka", 28));
		personList.add(new Person("suziki", 22));
		personList.add(new Person("izawa", 32));

		//名前と年齢の部分を表示
		for (Person data : personList) {
			System.out.println(data.getName() + "は" + data.getAge() + "歳");
		}

		//tanakaの部分
		System.out.println("一件目は" +
				personList.get(0).getName() + "さんです");

		//　データを年齢の若い人から歳をとった方の順に並び替えをして表示
		System.out.println(
				personList.stream()
						.sorted((s1, s2) -> s1.getAge() - s2.getAge())
						.collect(Collectors.toList()));

	}

}
