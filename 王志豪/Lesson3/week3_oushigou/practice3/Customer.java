package week3_oushigou.practice3;

public class Customer {
	// メンバ変数
	private String name;
	private String email;
	private String address;

	// コンストラクタ
	public Customer(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	// メソッド
	public void placeOrder(Product product, int quantity) {
		Order order = new Order(product, quantity, this.name); // 修正箇所
		order.processOrder();
	}

	public String getName() {
		return name;
	}
}
