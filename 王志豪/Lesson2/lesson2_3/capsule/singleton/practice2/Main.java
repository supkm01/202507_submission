package lesson2_3.capsule.singleton.practice2;

public class Main {

	public static void main(String[] args) {
		Bank bank = Bank.getBank();
		System.out.println(bank.getUserName());
		System.out.println(bank.getPassword());
		bank.checkAccount();

	}

}
