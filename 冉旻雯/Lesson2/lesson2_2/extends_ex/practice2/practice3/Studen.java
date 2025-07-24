package lesson2_2.extends_ex.practice3;

public class Studen extends Person implements Subject{
	// コンストラクタ。名前と年齢
	
	
	@Override
	public void study() {
		System.out.println(name + "勉強中です。");
		
	}

}
