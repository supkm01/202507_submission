package lesson3_3.regex;

public class Practice1 {

	public static void main(String[] args) {
		//メソッド１呼び出し
		String Username = "wzh";
		if (isUsernameValid(Username)) {
			System.out.println("名前有効");
		} else {
			System.out.println("名前無効");
		}

		//メソッド２呼び出し
		String Password = "wzh123456";
		if (isPasswordValid(Password)) {
			System.out.println("Password有効");
		} else {
			System.out.println("Password無効");
		}

	}

	//メソッド１
	public static Boolean isUsernameValid(String str) {
		return str.matches("^[a-zA-Z0-9]") && str.length() > 0;
	}

	//メソッド２
	public static Boolean isPasswordValid(String str) {
		return str.matches("^[a-zA-Z0-9]+$") && str.length() >= 8;
	}
}
