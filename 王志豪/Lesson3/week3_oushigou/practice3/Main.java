package week3_oushigou.practice3;

public class Main {

	public static void main(String[] args) {
		 // 商品の作成
        Product laptop = new Product("Laptop", 999.99, 10);
        Product smartphone = new Product("Smartphone", 499.99, 20);

        // 顧客の作成
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Main St");

        // 注文処理
        customer.placeOrder(laptop, 3);
        customer.placeOrder(smartphone, 5);
        customer.placeOrder(laptop, 10);  // 在庫不足

        // 注文処理後の商品の在庫を確認
        System.out.println("\nRemaining stock for Laptop: " + laptop.getStock());
        System.out.println("Remaining stock for Smartphone: " + smartphone.getStock());
	}

}
