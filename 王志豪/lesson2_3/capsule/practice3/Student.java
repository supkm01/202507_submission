package lesson2_3.capsule.practice3;

public class Student extends Person {
	//メンバ変数
	private String studentId;

	//コンストラクタ
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	//set get メソッド
	public String getStudengtId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
