package lesson2_3.capsule.practice2;

//子クラス
public class Manager extends Employee {
	//メンバ変数
	//マネージャの所属部署
	private String department;

	//コンストラクタ

	public Manager(String name, int employeeID, double salary, String department) {
		super(name, employeeID, salary);
		this.department = department;
	}

	//マネージャの所属部署を取得
	public String getDepartment() {
		return department;
	}

}
