package lesson3_2.practice4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Bookリストの宣言
		List<Book> books = new ArrayList<Book>();
		//Bookの追加
		books.add(new Book("吾輩は猫である", "夏目漱石", "フィクション"));
		books.add(new Book("銀河鉄道の夜", "宮沢賢治", "ファンタジー"));
		books.add(new Book("こころ", "夏目漱石", "フィクション"));

		//本のジャンルが  「フィクション」の本のみのデータをすべて出力する。
		for (Book data : books) {
			if (data.getGenre() == "フィクション") {
				System.out.println(books);
			}

		}

	}

}
