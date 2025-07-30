package lesson3_3.regex_ex;

public class Practice1 {

	public static void main(String[] args) {
		String username = "", password = "";
		System.out.println(isUsernameValid(username));
		System.out.println(isPasswordValid(password));
	}

	//メソッド1作成
	public static boolean isUsernameValid(String username) {
		if (username.length() == 0) {
			return false;
		}
		return username.matches("[A-Za-z0-9]+");
	}

	//メソッド2作成
	public static boolean isPasswordValid(String password) {
		if (password.length() < 8) {
			return false;
		}
		return password.matches("[A-Za-z0-9_]*");
	}

}
