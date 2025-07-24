package lesson2_3.capsule.singleton;

public class Camany {
	// メンバ変数
	// 社員ID
	private int userID;
	// パスワード
	private String passwords;

	// この設計書で唯一のインスタンス（実体）を保持する。
	private static Camany comany = new Camany();

	// 外部からインスタンスが作成されないようにprivateにする
	private Camany() {
		this.userID = 1;
		this.passwords = "abc123";
		
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public static Camany getComany() {
		return comany;
	}

	public static void setComany(Camany comany) {
		Camany.comany = comany;
	}
	

}
