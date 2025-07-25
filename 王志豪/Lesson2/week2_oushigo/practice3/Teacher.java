package week2_oushigo.practice3;

public class Teacher {
	//privateな変数
	private String name;
	private String subject;

	//唯一のインスタンス
	private static Teacher teacher = new Teacher();

	//privateなコンストラクタ
	private Teacher() {
		this.name = "Alice";
		this.subject = "Japanese";
	}

	//公開メソッド
	public void teach() {
		System.out.println("Hello");
	}

	//get set メソッド
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

	//唯一のインスタンスを獲得するメソッド
	public static Teacher getTeacher() {
		return teacher;
	}

}
