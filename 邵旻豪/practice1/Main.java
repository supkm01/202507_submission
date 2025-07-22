package lesson2_2.extends_ex.practice1;

//Mainクラス（実行クラス）
public class Main {

	public static void main(String[] args) {
		//		・Carクラスをインスタンス化
		Car aa = new Car("AA");
		//		・親クラスのメソッドを呼び出す
		aa.displayBrand();
		//		・Carクラス独自のメソッドを呼び出す
		aa.drive();
	}

}
