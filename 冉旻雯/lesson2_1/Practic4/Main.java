package lesson2_1.Practic4;

public class Main {

	public static void main(String[] args) {
		//二人の成績を作成する。インスタンス
		//1.名前：タロウ　国語：80、数学：75、英語：90
		Student tarou = new Student("タロウ",80,75,90);
		//2.名前：ハナコ　国語：90、数学：70、英語：80
		Student hanako = new Student("ハナコ",80,75,90);
		//「成績表」を表示
		System.out.println(tarou.showScore);
		System.out.println(hanako.showScore);
	}

}
