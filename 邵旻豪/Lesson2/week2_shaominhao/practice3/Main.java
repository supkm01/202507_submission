package week2_shaominhao.practice3;

public class Main {

	public static void main(String[] args) {
		//唯一のインスタンス変数はteacherとして表示する
		Teacher teacher = Teacher.getTeacher();
		//出力
		System.out.println("name :" + teacher.getName());
		System.out.println("subject :" + teacher.getSubject());
		teacher.teach();
	}

}
