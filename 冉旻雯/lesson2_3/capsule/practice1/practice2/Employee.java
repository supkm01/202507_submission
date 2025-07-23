package lesson2_3.capsule.practice2;

//親クラス
public class Employee {
	//従業員の名前
	private String name;
	//従業員のID
	private int employeeID;
	//従業員の給与
	protected double salary;

	//コンストラクタ
	public Employee(String name, int employeeID, double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;

	}

	//従業員の名前を取得
	public String getName() {
		return name;
	}

	//従業員のIDを取得
	public int getEmployeeID() {
		return employeeID;
	}

	//給与を設定する
	public void setSalary(double salary) {
		if (salary > 0) {
			System.out.println(salary);
		}
	}

	//給与を増額
	public void raiseSalary(double amount) {
		if (amount > 0) {
			salary = salary + amount;
		}
	}

}
