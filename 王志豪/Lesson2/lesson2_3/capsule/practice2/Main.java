package lesson2_3.capsule.practice2;

public class Main {

	public static void main(String[] args) {
		// Employeeクラスのインスタンスを作成
		// 引数："John Doe", 1001, 50000.0
		// ソースコードを書いてください
		Employee emp1 = new Employee("John Doe", 1001, 50000.0);
		// 下記のようにEmployeeの情報を表示（System.out.printlnを使用）
		// Employee Name: John Doe
		// Employee ID: 1001
		// Employee Salary: $50000.0
		// ソースコードを書いてください

		System.out.println("Employee Name:" + emp1.getName());
		System.out.println("Employee ID:" + emp1.getEmployeeID());
		System.out.println("Employee Salary:$" + emp1.salary);

		// 給与を増額
		// raiseSalaryメソッドの呼び出し（引数：5000.0）
		// ソースコードを書いてください
		emp1.raiseSalary(5000);
		System.out.println("New Employee Salary: $" + emp1.salary);

		// Managerクラスのインスタンスを作成
		// 引数："Alice Smith", 2001, 75000.0, "Human Resources"
		// ソースコードを書いてください
		Manager M1 = new Manager("Alice Smith", 2001, 75000.0, "Human Resources");
		// 下記のようにManagerの情報を表示（System.out.printlnを使用）
		// Manager Name: Alice Smith
		// Manager ID: 2001
		// Manager Salary: $75000.0
		// Manager Department: Human Resources
		// ソースコードを書いてください
		System.out.println("Manager Name:" + M1.getName());
		System.out.println("Manager ID:" + M1.getEmployeeID());
		System.out.println("Manager Salary:$" + M1.salary);
		System.out.println("Manager Department:" + M1.getDepartment());
		
		// Managerの給与を増額
        // raiseSalaryメソッドの呼び出し（引数：10000.0）
        // ソースコードを書いてください
		M1.raiseSalary(10000.0);
        System.out.println("New Manager Salary: $" + M1.salary);
		
		
		
	}

}
