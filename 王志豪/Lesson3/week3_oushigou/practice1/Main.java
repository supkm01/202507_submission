package week3_oushigou.practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ArrayListの作成とデータの代入
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Alice", 15, 60));
		student.add(new Student("Takuya", 12, 90));
		student.add(new Student("Ryo", 25, 34));
		student.add(new Student("Suzanu", 18, 20));
		// streamで生徒の点数が60点未満を抽出かつ生徒の点数を大⇒小に並び替える
		student.stream()
				.filter(e -> e.getScore() < 60)
				.sorted((s1, s2) -> s2.getScore() - s1.getScore())
				.forEach(a -> System.out.println(a));

	}
}
