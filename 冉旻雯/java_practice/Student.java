package java_practice;

//子クラス「Person」を継承し
//インタフェース「Runnable」を実装　
public class Student extends Person implements Runnable {
	//メンバ変数
	//学生の学籍番号
	private String studentId;

	//コンストラクタ
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	//インタフェースの実装
	@Override
	public void run() {
		System.out.println(
			 name + " is running.");
	}
	
	//getter
	public String getStudentId() {
		return studentId;
	}
	
	

}
