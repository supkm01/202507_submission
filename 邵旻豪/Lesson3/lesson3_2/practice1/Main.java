package lesson3_2.practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Student> students = new ArrayList<Student>();
		//データの挿入
		students.add(new Student("Alice", 19, "110120"));
		students.add(new Student("Bob", 21, "110121"));
		students.add(new Student("Carol", 20, "110122"));
		students.add(new Student("Dave", 19, "110123"));
		//生徒の個人情報を出力
		System.out.println(students);
		for(Student data:students) {
			System.out.println(data);
		}

	}

}
