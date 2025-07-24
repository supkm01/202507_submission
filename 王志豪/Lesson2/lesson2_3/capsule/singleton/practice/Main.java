package lesson2_3.capsule.singleton.practice;

public class Main {

	public static void main(String[] args) {
		Login userLogin = Login.getLogin();
		
		System.out.println(userLogin.getUserName());
		System.out.println(userLogin.getPassword());
		userLogin.auth();

	}

}
