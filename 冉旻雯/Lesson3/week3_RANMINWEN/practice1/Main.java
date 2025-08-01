package week3_RANMINWEN.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Listを作成
		List<Student> student = new ArrayList<Student>();
		//listの追加
		/*
		new Student("Alice",15,60)
		new Student("Takuya",12,90)
		new Student("Ryo",25,34)
		new Student("Suzanu",18,20)
		 */
		student.add(new Student("Alice", 15, 60));
		student.add(new Student("Takuya", 12, 90));
		student.add(new Student("Ryo", 25, 34));
		student.add(new Student("Suzanu", 18, 20));

		//以下の条件に従ってデータを抽出し、コンソールに表示
		System.out.println(
				student.stream()
						//1：生徒の点数が60点未満を抽出
						.filter(e -> e.getScore() < 60)
						//2：生徒の点数を大⇒小に並び替える
						.sorted((s1, s2) -> s2.getScore() - s1.getScore())
						.collect(Collectors.toList()));
	}

}
