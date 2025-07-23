package lesson2_3.capsule.practice3;

public class Main {

	public static void main(String[] args) {
		// メソッド:
		//- 振る舞い:
		//**`Student`** クラスのインスタンス **`alice`** を作成し、引数として **`"Alice"`**, **`20`**, **`"12345"`** を渡す。
		Student student = new Student("Alice", 20, "12345");

		//**`alice`** の **`introduce()`** メソッドを呼び出す。
		student.introduce();
		//**`alice`** の **`getStudentId()`** メソッドの結果と共に、"学生ID: " を表示する。
		System.out.println("学生ID:" + student.getStudentId());

	}

}
