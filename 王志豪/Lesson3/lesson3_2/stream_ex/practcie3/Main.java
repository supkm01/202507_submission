package lesson3_2.stream_ex.practcie3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Laptop","Electronics",100000,5));
		list.add(new Product("Phone","Electronics",80000,10));
		list.add(new Product("Desk","Furniture",30000,15));
		list.add(new Product("Chair","Furniture",15000,20));
		list.add(new Product("Monitor","Electronics",20000,8));
		list.add(new Product("Cupboard","Furniture",40000,12));
		list.add(new Product("Headphones","Electronics",15000,25));
		
		System.out.println("在庫が10未満の商品:");
				list.stream()
					.filter(e -> e.getStock() < 10)
					.forEach(a -> System.out.println(a.getName() + "：" + a.getStock()));
		
		System.out.println("「Electronics」"+"カテゴリーの商品（価格順）:");
		list.stream()
					.filter(e -> e.getCategory().equals("Electronics"))
					.sorted((s1, s2) -> s1.getPrice() - s2.getPrice())
					.forEach(a -> System.out.println(a.getName() + "：" + a.getPrice()));;

	}

}
