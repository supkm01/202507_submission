package lesson3_2.list_ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//
		List<Cat> cats = new ArrayList<Cat>();
		//データの挿入
		cats.add(new Cat("Alice" ,2));
		cats.add(new Cat("Kitty" ,5));
		System.out.println(cats);
		
		//toStringを使わない
		//名前と年齢を表示する方法
		//get(0)是取得第一個元素。本質上還是取得第一個元素的tostring
		System.out.println(cats.get(0));
		System.out.println(cats.get(0).getName());
		System.out.println(cats.get(0).getAge());
	}



	

}
