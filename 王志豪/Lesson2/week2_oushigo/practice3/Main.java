package week2_oushigo.practice3;

public class Main {

	public static void main(String[] args) {
		//Teacherクラス唯一のインスタンスを獲得する
		Teacher teacher = Teacher.getTeacher();

		//出力する
		System.out.println("name :" + teacher.getName());
		System.out.println("subject :" + teacher.getSubject());
		teacher.teach();
	}

}
