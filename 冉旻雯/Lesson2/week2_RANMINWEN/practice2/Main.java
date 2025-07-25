package week2_RANMINWEN.practice2;

public class Main {

	public static void main(String[] args) {

		Item[] items = {
				//武器とその攻撃力
				new Buki("鉄の剣", 20),
				//アーマー名前とその守備力
				new Armor("皮の服", 10)
		};
		//実行し、結果を表示。
		for (Item item : items) {
			item.use();
		}
	}

}
