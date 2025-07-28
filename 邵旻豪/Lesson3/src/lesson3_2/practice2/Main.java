package lesson3_2.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Listを宣言
		List<Integer> list = new ArrayList<Integer>();
		//データの挿入
		list.add(15);
		list.add(20);
		list.add(30);
		list.add(45);
		list.add(55);
		//リストから偶数の要素をすべて削除します。
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
		//加算
		int num = 0;
		for (int i = 0; i < list.size(); i++) {
			num = list.get(i) + num;
		}

		System.out.println("リストの全要素の合計: " + num);
	}

}
