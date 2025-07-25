package week2_RANMINWEN.practice3;

public class Main {

	public static void main(String[] args) {
		//Teacherクラスから唯一のインスタンスを取得
		Teacher teacher = Teacher.getTeacher();
		//名前を取得し、表示。
		System.out.println("name :"+teacher.getName());
		//科目を取得し、表示。
		System.out.println("subject :"+teacher.getSubject());
		//teachメソッドを実行し、結果を表示。
		teacher.teach();
	}

}
