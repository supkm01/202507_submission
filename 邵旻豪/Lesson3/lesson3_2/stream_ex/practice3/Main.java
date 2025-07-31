package lesson3_2.stream_ex.practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//以下の商品情報を含むリストを作成する
		List<Product> list = new ArrayList<>();

		list.add(new Product("Laptop", "Electronics", 100000, 5));
		list.add(new Product("Phone", "Electronics", 80000, 10));
		list.add(new Product("Desk", "Furniture", 30000, 15));
		list.add(new Product("Chair", "Furniture", 15000, 20));
		list.add(new Product("Monitor", "Electronics", 20000, 8));
		list.add(new Product("Cupboard", "Furniture", 40000, 12));
		list.add(new Product("Headphones", "Electronics", 15000, 25));
		System.out.println("在庫が10未満の商品:");
		list.stream()
				.filter(i -> i.getStock() < 10)
				.forEach(i -> System.out.println(i.getName() + ":" + i.getStock()));
		System.out.println("");
		System.out.println("「Electronics」 カテゴリーの商品（価格順）:");
		list.stream()
				.filter(i -> i.getCategory().equals("Electronics"))
				.sorted((s1, s2) -> s2.getPrice() - s1.getPrice())
				.forEach(i -> System.out.println(i.getName() + ":" + i.getPrice()));
	}
}
