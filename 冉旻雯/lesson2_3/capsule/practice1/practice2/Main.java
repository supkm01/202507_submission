package lesson2_3.capsule.practice2;

public class Main {

	public static void main(String[] args) {
		// Employeeクラスのインスタンスを作成
		// 引数："John Doe", 1001, 50000.0
		Employee jone = new Employee("John Doe", 1001, 50000.0);

		// 下記のようにEmployeeの情報を表示（System.out.printlnを使用）
		// Employee Name: John Doe
		
		// Employee ID: 1001
		// Employee Salary: $50000.0
		// ソースコードを書いてください

		// 給与を増額
		// raiseSalaryメソッドの呼び出し（引数：5000.0）
		// ソースコードを書いてください
		System.out.println("New Employee Salary: $" + employee.salary);

		// Managerクラスのインスタンスを作成
		// 引数："Alice Smith", 2001, 75000.0, "Human Resources"
		// ソースコードを書いてください

		// 下記のようにManagerの情報を表示（System.out.printlnを使用）
		// Manager Name: Alice Smith
		// Manager ID: 2001
		// Manager Salary: $75000.0
		// Manager Department: Human Resources
		// ソースコードを書いてください

		// Managerの給与を増額
		// raiseSalaryメソッドの呼び出し（引数：10000.0）
		// ソースコードを書いてください
		System.out.println("New Manager Salary: $" + manager.salary);
	}

}
