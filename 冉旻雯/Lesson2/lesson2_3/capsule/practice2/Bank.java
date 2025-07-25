package lesson2_3.capsule.singleton.practice2;

public class Bank {
	//ユーザー名
	private String userName;
	//パスワード
	private String password;

	//この設計書で唯一のインスタンスを保持する。
	private static Bank bank = new Bank();

	//コンストラクタ。
	private Bank() {
		this.userName = "Tester";
		this.password = "9999";

	}

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
