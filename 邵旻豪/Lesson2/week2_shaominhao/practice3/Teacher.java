package week2_shaominhao.practice3;

public class Teacher {
	//メンバー変数
	//名前
	private String name;
	//科目
	private String subject;
	//唯一のインスタンス
	private static Teacher teacher = new Teacher();

	//コンストラクタ
	private Teacher() {
		this.name = "Alice";
		this.subject = "Japanese";
	}

	//公開メソッド
	public void teach() {
		System.out.println("Hello");
	}

	//get set
	//nameの値を返す
	public String getName() {
		return name;
	}

	//nameの値を設定
	public void setName(String name) {
		this.name = name;
	}

	//subjectの値を返す
	public String getSubject() {
		return subject;
	}

	//subjectの値を設定
	public void setSubject(String subject) {
		this.subject = subject;
	}

	//唯一のインスタンスteacherを返す
	public static Teacher getTeacher() {
		return teacher;
	}

}
