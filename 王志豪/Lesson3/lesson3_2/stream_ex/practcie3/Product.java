package lesson3_2.stream_ex.practcie3;

public class Product {
	//メンバ変数
	private String name;
	private String category;
	private int price ;
	private int stock ;
	//コンストラクタ
	public Product(String name, String category, int price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
