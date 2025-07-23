package lesson2_3.capsule.practice2;

//Employeeクラスを継承する。
public class Manager extends Employee {
	//フィールド
	private String department;

	//コンストラクタ
	public Manager(String name, int employeeID, double salary, String department) {
		super(name, employeeID, salary);
		this.department = department;
	}

	//メソッド
	//機能: マネージャの所属部署を取得する。
	public String getDepartment() {
		return department;
	}
}
