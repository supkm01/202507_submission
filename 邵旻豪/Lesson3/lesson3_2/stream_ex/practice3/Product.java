package lesson3_2.stream_ex.practice3;

public class Product {
	//メンバー変数
	//商品名
	private String name;
	//カテゴリー
	private String category;
	//価格、整数で管理
	private int price;
	//在庫数
	private int stock;

	//コンストラクタ、getter/setterも用意する

	public Product(String name, String category, int price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}

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
