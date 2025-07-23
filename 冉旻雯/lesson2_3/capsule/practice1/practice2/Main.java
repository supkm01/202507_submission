package lesson2_3.capsule.practice2;

public class Main {

	public static void main(String[] args) {
		// Employeeクラスのインスタンスを作成
		// 引数："John Doe", 1001, 50000.0
		Employee employee = new Employee("John Doe", 1001, 50000.0);

		// 下記のようにEmployeeの情報を表示（System.out.printlnを使用）
		// Employee Name: John Doe
		System.out.println("Employee Name: " + employee.getName());
		// Employee ID: 1001
		System.out.println("Employee ID: " + employee.getEmployeeID());
		// Employee Salary: $50000.0
		System.out.println("Employee Salary: " + employee.salary);
		// ソースコードを書いてください

		// 給与を増額
		// raiseSalaryメソッドの呼び出し（引数：5000.0）
		employee.raiseSalary(5000.0);
		// ソースコードを書いてください
		System.out.println("New Employee Salary: $" + employee.salary);

		// Managerクラスのインスタンスを作成
		// 引数："Alice Smith", 2001, 75000.0, "Human Resources"
		Manager manager = new Manager("Alice Smith", 2001, 75000.0, "Human Resources");

		// 下記のようにManagerの情報を表示（System.out.printlnを使用）
		// Manager Name: Alice Smith
		System.out.println("Manager Name: " + manager.getName());
		// Manager ID: 2001
		System.out.println("Manager ID: " + manager.getEmployeeID());
		// Manager Salary: $75000.0
		System.out.println("Manager Salary: " + manager.salary);
		// Manager Department: Human Resources
		System.out.println("Manager  Department: " + manager.getDepartment());

		// Managerの給与を増額
		// raiseSalaryメソッドの呼び出し（引数：10000.0）
		manager.raiseSalary(10000.0);
		// ソースコードを書いてください
		System.out.println("New Manager Salary: $" + manager.salary);
	}

}
