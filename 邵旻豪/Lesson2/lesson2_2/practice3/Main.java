package lesson2_2.extends_ex.practice3;

public class Main {

	public static void main(String[] args) {
		Student[] student = {
				new Student("Alice", 20),
				new Student("Bob", 19)
		};
		for (Student s : student) {
			s.study();
		}
	}

}
