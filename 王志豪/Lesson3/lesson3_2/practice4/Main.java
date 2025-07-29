package lesson3_2.practice4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("吾輩は猫である", "夏目漱石", "フィクション"));
		book.add(new Book("銀河鉄道の夜", "宮沢賢治", "ファンタジー"));
		book.add(new Book("こころ", "夏目漱石", "フィクション"));

		for (Book bk : book) {
			if (bk.getGenre() == "フィクション") {
				System.out.println(bk);
			}
		}

	}
}
