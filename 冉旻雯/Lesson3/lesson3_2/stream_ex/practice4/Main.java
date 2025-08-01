package lesson3_2.stream_ex.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Listを作成
		List<Teacher> teachers = new ArrayList<Teacher>();
		//litsの追加
		teachers.add(new Teacher("Sasaki", 50));
		teachers.add(new Teacher("Tanaka", 24));
		teachers.add(new Teacher("Suzuki", 39));

		//教師の年齢が大きい⇒小さい順に並び替える
		System.out.println(
				teachers.stream()
				.sorted((s1, s2) -> s2.getAge() - s1.getAge())
				.collect(Collectors.toList()));
				

	}

}
