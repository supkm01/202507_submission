package lesson2_3.capsule.pratice3;

//子クラス
public class Student extends Person {
	//メンバ変数
	//学生のID
	private String studentId;

	//コンストラクタ:
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	//学生のIDを返す
	public String getStudentId() {
		return studentId;
	}

	//setter
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
