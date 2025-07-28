package lesson3_2.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Listの宣言
		List<Integer> list = new ArrayList<Integer>();
		
		//static変数宣言
		int count = 0; 
		
		
		//addメソッド
		list.add(15);
		list.add(20);
		list.add(35);
		list.add(40);
		list.add(55);
		
		//forで偶数を削除する
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
		
		for(Integer i :list) {
			count += i;
		}
		System.out.println("リストの全要素の合計: " + count);

	}

}
