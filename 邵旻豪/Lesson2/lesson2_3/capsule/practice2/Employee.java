package lesson2_3.capsule.practice2;

//親class
public class Employee {
	// private修飾子を持つString型の「name」フィールド: 従業員の名前を格納する。
	private String name;
	// private修飾子を持つint型の「employeeID」フィールド: 従業員のIDを格納する。
	private int employeeID;
	//protected修飾子を持つdouble型の「salary」フィールド: 従業員の給与を格納する。
	protected double salary;

	//コンストラクタ
	public Employee(String name, int employeeID, double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	//メソッド
	//機能: 従業員の名前を取得する。
	//戻り値: String型、従業員の名前。自動
	public String getName() {
		return name;
	}

	//機能: 従業員のIDを取得する。
	//戻り値: int型、従業員のID。自動

	public int getEmployeeID() {
		return employeeID;
	}

	// 機能: 給与を設定する。引数が0以上の場合にのみ設定する。
	//引数: double型、設定する給与。
	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	//機能: 給与を増額する。引数が正の場合にのみ増額する。
	public void raiseSalary(double amount) {
		if (amount > 0) {
			this.salary = salary + amount;
		}
	}
}
