package week2_RANMINWEN.practice3;

public class Teacher {
	// メンバ変数
	//名前
	private String name;
	//科目
	private String subject;
	//この設計書で唯一のインスタンス（実体）を保持する。
	private static Teacher teacher = new Teacher();

	//この先生の名前と科目
	private Teacher() {
		this.name = "Alice";
		this.subject = "Japanese";
	}

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static Teacher getTeacher() {
		return teacher;
	}

	//helloと出力
	public void teach() {
		System.out.println("Hello");
	}

}