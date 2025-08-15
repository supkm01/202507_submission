package java_practice;
//クラス「Person」を継承し、インタフェース「Runnable」を実装する。
public class Student extends Person implements Runnable{
	//メンバー変数
	//private修飾子を持つString型の「studentId」フィールド：学生の学籍番号を格納する。
	private String studentID;
	//コンストラクタ：

	public Student(String name, int age, String studentID) {
		super(name, age);
		this.studentID = studentID;
	}
//	- メソッド：
//    - 「run()」メソッド（インタフェース「Runnable」の実装）：学生が走る操作を表現する。コンソールに「[name] is running.」と表示する。

	@Override
	public void run() {
		System.out.println(name+" is running");
		
	}
//  - 「studentId」フィールドのgetterを作成する。
	public String getStudentID() {
		return studentID;
	}
	
	

	
	
}
