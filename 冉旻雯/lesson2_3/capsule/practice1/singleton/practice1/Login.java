package lesson2_3.capsule.singleton.practice1;

public class Login {
	// メンバ変数
	//ユーザー名
	private String userName;
	//パスワード
	private String password;
	//この設計書で唯一のインスタンス（実体）を保持する。
	private static Login login = new Login();

	private Login() {
		this.userName = "Admin";
		this.password = "abc123";

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

	public static Login getLogin() {
		return login;
	}

	public void auth() {
		System.out.println("ログインに成功しました");
	}

}
