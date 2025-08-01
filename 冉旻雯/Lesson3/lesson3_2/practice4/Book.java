package lesson3_2.practice4;

//設計書
public class Book {
	//本のタイトル
	private String title;
	//本の著者
	private String author;
	//本のジャンル
	private String genre;

	//コンストラクタ
	Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	//getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// toStringのオーバーライド
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}

}
