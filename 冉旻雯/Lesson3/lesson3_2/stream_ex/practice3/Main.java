package lesson3_2.stream_ex.practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 商品リスト
		List<Product> productList = new ArrayList<Product>();
		//		("Laptop", "Electronics", 100000, 5)
		productList.add(new Product("Laptop", "Electronics", 100000, 5));
		//		("Phone", "Electronics", 80000, 10)
		productList.add(new Product("Phone", "Electronics", 80000, 10));
		//		("Desk", "Furniture", 30000, 15)
		productList.add(new Product("Desk", "Furniture", 30000, 15));
		//		("Chair", "Furniture", 15000, 20)
		productList.add(new Product("Chair", "Furniture", 15000, 20));
		//		("Monitor", "Electronics", 20000, 8)
		productList.add(new Product("Monitor", "Electronics", 20000, 8));
		//		("Cupboard", "Furniture", 40000, 12)
		productList.add(new Product("Cupboard", "Furniture", 40000, 12));
		//		("Headphones", "Electronics", 15000, 25)
		productList.add(new Product("Headphones", "Electronics", 15000, 25));

		//在庫数が10未満の商品をリストアップし、商品名と在庫数を表示してください。
		System.out.println("在庫が10未満の商品:");
				productList.stream()
						.filter(e -> e.getStock() < 10)
						.forEach(a -> System.out.println(a.getName()+ ":"+ a.getStock()));

	}

}
