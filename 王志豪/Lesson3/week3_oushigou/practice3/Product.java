package week3_oushigou.practice3;

public class Product {
	// メンバ変数
	private String name;
	private double price;
	private int stock;

	// コンストラクタ
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// メソッド
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	 public void decreaseStock(int quantity) {
	        if (stock >= quantity) {
	            stock -= quantity;
	            System.out.println("Stock decreased by " + quantity + " for product: " + name + ". Remaining stock: " + stock);
	        } else {
	            System.out.println("Insufficient stock for product: " + name + ". Remaining stock: " + stock);
	        }
	    }
}
