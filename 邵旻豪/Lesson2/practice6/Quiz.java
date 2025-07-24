package lesson2_3.capsule.practice6;

public class Quiz {
	//メンバー変数
	public String main;

	//コンストラクタの作成
	public Quiz(String main) {
		this.main = main;
	}

	//displayHeaderメソッドの作成
	public void displayHeader() {
		System.out.println("「次の問いに答えなさい」");
	}

	//displayMainメソッドの作成
	public void displayMain() {
		System.out.println(main);
	}
}
