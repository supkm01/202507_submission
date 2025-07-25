package week2_oushigo.practice2;

public class Main {

	public static void main(String[] args) {
		//インスタンスを行列で作ります。
		Item[] items = {
				new Buki("鉄の剣", 20),
				new Armor("皮の服", 10)
		};

		//forで各自のuseメソッドを呼び出します。
		for (Item item : items) {
			item.use();
		}

	}

}
