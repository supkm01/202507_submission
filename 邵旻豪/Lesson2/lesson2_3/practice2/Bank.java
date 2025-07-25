package lesson2_3.capsule.singleton.practice2;

public class Bank {
	//メンバー変数
	//ユーザー名
	private String userName;
	//パスワード
	private String password;
	//唯一のインスタンス（実体）
	private static Bank bank = new Bank();

	//コンストラクタ
	private Bank() {
		this.userName = "Tester";
		this.password = "9999";
	}

	//set get
	//ユーザー名を返すメソッド。
	public String getUserName() {
		return userName;
	}

	//ユーザー名を設定するメソッド。
	public void setUserName(String userName) {
		this.userName = userName;
	}

	//パスワードを返すメソッド。
	public String getPassword() {
		return password;
	}

	//パスワードを設定するメソッド。
	public void setPassword(String password) {
		this.password = password;
	}

	//唯一のインスタンスを取得するための静的メソッド。
	public static Bank getBank() {
		return bank;
	}

	public static void setBank(Bank bank) {
		Bank.bank = bank;
	}

	//アカウント確認を行うメソッド。
	public void checkAccount() {
		System.out.println("アカウントを確認しました。");
	}

}
