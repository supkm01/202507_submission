package lesson2_2.extends_ex.practice3;

//Student クラスは Person クラスを継承し、Subject インタフェースを実装します。
public class Student extends Person implements Subject {

	public Student(String name, int age) {
		super(name, age);
	}

	//- メソッド:
	//- コンストラクタ。親クラスのコンストラクタを呼び出して名前と年齢を設定します。
	//- **`void study()`**: 勉強を行い、"[name]が勉強中です。"というメッセージを表示します。
	@Override
	public void study() {
		System.out.println(name + "が勉強中");

	}

}
