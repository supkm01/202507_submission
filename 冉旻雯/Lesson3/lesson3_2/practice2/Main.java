package lesson3_2.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//リストの宣言
		List<Integer> numbers = new ArrayList<Integer>();
		//リストに値を追加します：15, 20, 30, 45, 55
		numbers.add(15);
		numbers.add(20);
		numbers.add(30);
		numbers.add(45);
		numbers.add(55);

		//偶数の要素をすべて削除する
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
			} else {
				sum = sum + numbers.get(i);
			}

		}
		//合計を計算して表示します
		System.out.println(sum);

	}

}
