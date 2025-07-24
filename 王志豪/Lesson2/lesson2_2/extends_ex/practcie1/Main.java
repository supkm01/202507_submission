package lesson2_2.extends_ex.practcie1;

public class Main {

	public static void main(String[] args) {
		//		Mainクラス（実行クラス）
		//		・Carクラスをインスタンス化
		Car honda = new Car("honda");
		//		・親クラスのメソッドを呼び出す
		honda.displayBrand();
		//		・Carクラス独自のメソッドを呼び出す
		honda.drive();
		

	}

}
