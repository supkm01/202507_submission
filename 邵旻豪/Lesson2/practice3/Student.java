package lesson2_3.capsule.practice3;

//親クラス Person を継承する。
public class Student extends Person {
	//private修飾子を持つString型の studentId フィールド：学生のIDを格納する。
	private String studentId;

	//コンストラクタ:
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	//メソッド:
	//学生のIDを返す。
	public String getStudentId() {
		return studentId;
	}

	//引数として受け取った studentId をフィールドに設定する。
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
