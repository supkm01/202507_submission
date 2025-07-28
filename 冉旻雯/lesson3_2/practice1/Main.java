package lesson3_2.practice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//リストの宣言
		List<Student> students = new ArrayList<Student>();
		//名前　Alice　年齢19　学号　110120
		students.add(new Student("Alice", 19, 110120));
		//名前　Bob　年齢21　学号　110121
		students.add(new Student("Bob", 21, 110121));
		//名前　Carol　年齢20　学号　110122
		students.add(new Student("Carol", 20, 110122));
		//名前　Dave　年齢19　学号　110123
		students.add(new Student("Dave", 190, 110123));

		//各生徒の個人情報を出力
		for (Student data : students) {
			System.out.println("名前：" + data.getName());
			System.out.println("年齢：" + data.getAge());
			System.out.println("学号：" + data.getId());
		}

	}

}
