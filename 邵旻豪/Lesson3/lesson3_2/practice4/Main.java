package lesson3_2.practice4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List の宣言
		List<Book> books = new ArrayList<Book>();
		//データの挿入
		books.add(new Book("吾輩は猫である", "夏目漱石", "フィクション"));
		books.add(new Book("銀河鉄道の夜", "宮沢賢治", "ファンタジー"));
		books.add(new Book("こころ", "夏目漱石", "フィクション"));

		//本のジャンルが  「フィクション」の本のみのデータをすべて出力する。
		for (Book book : books) {
			if (book.getGenre() == "フィクション") {
				System.out.println(book);
			}
		}
	}

}
