package lesson2_3.capsule.singleton.practice1;

public class Login {
	//メンバー変数
	//ユーザー名を格納するためのフィールド
	private String userName;
	//パスワードを格納するためのフィールド。
	private String password;
	//この設計書で唯一のインスタンス（実体）を保持する。
	private static Login login = new Login();

	//コンストラクタ
	private Login() {
		this.userName = "Admin";
		this.password = "1234abcd";
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

	public static void setLogin(Login login) {
		Login.login = login;
	}

	//ログイン認証を行うメソッド。"ログインに成功しました"と表示する。
	public void auth() {
		System.out.println("ログインに成功しました");
	}

}
