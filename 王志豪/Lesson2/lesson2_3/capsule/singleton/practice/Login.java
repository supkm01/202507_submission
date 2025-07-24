package lesson2_3.capsule.singleton.practice;

public class Login {
	//フィールド
	private String userName;
	private String password;
	private static Login login = new Login();
	//コンストラクタ。外部からのインスタンス化を防ぐためにprivateで定義されている。
	//初期設定として、userNameは "Admin" であり、passwordは "1234abcd" に設定される。
	private Login() {
		userName = "Admin";
		password = "1234abcd";
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
	//唯一のインスタンスを取得するための静的メソッド。
	public static Login getLogin() {
		return login;
	}
	//ログイン認証を行うメソッド。"ログインに成功しました"と表示する。
	void auth() {
		System.out.println("ログインに成功しました");
	}
	
	
	
	
}
