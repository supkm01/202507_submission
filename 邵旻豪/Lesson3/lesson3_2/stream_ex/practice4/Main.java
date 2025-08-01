package lesson3_2.stream_ex.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Listの宣言
		List<Teacher> list = new ArrayList<>();
		//データの挿入
		list.add(new Teacher("Sasaki", 50));
		list.add(new Teacher("Tanaka", 24));
		list.add(new Teacher("Suzuki", 39));
		//教師の年齢が大きい⇒小さい順に並び替える
		System.out.println(
				list.stream()
						.sorted((s1, s2) -> s2.getAge() - s1.getAge())
						.collect(Collectors.toList()));
	}

}
