package week3_shaominhao.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Listの宣言
		List<Student> student = new ArrayList<>();
		//データの挿入
		student.add(new Student("Alice", 15, 60));
		student.add(new Student("Takuya", 12, 90));
		student.add(new Student("Ryo", 25, 34));
		student.add(new Student("Suzanu", 18, 20));
		//- 以下の条件に従ってデータを抽出し、コンソールに表示させてください
		System.out.println(
				student.stream()
						//1：生徒の点数が60点未満を抽出
						.filter(i -> i.getScore() < 60)
						//生徒の点数を大⇒小に並び替える
						.sorted((s1, s2) -> s2.getScore() - s1.getScore())
						.collect(Collectors.toList()));

	}

}
