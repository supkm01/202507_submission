package lesson3_2.stack_ex;

import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		//stackの宣言
		Stack<Integer> numList = new Stack<Integer>();
		//データの挿入
		numList.push(10);
		numList.push(20);
		numList.push(30);
		System.out.println(numList);
		//先頭要素を取得して削除
		System.out.println(numList.pop());//输出了以后，30就消失了
		System.out.println(numList);
		
		//先頭要素を削除しないで取得
		System.out.println(numList.peek());
		System.out.println(numList);
	}

}
