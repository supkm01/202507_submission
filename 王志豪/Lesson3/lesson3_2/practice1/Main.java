package lesson3_2.practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成
		List<Students> students = new ArrayList<Students>();
		//データの挿入
		students.add(new Students("Alice", 19, "110120"));
		students.add(new Students("Bob", 21, "110121"));
		students.add(new Students("Carol", 20, "110122"));
		students.add(new Students("Dave", 19, "110123"));
		//
		for (Students stu : students) {
            System.out.println(stu);
        }
	}

}
