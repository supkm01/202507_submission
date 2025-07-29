package lesson3_2.practice4;

public class Book {
	//フィールド
	private String title;
	private String author;
	private String genre;

	//コンストラクタ
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	//get set toString
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

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}
	
	
	

}
