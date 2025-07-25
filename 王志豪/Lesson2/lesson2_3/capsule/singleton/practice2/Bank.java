package lesson2_3.capsule.singleton.practice2;

public class Bank {

	//フィールド
	private String userName;
	private String password;
	//唯一のインスタンス
	private static Bank bank = new Bank();

	//コンストラクタ
	private Bank() {
		userName = "Tester";
		password = "9999";

	}

	//get setメソッド
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Bank getBank() {
		return bank;
	}

	public void checkAccount() {
		System.out.println("アカウントを確認しました。");
	}
	
	
}
