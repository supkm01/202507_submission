package week2_oushigo.practice2;

public class Buki implements Item {
	//インスタンス変数
	//武器の名前と武器の攻撃力
	private String name;
	private int attackValue;

	//武器の名前と武器の攻撃力のコンストラクタ
	public Buki(String name, int attackValue) {
		this.name = name;
		this.attackValue = attackValue;
	}

	//getメソッド
	public String getName() {
		return name;
	}

	public int getAttackValue() {
		return attackValue;
	}

	//インタフェースの実装メソッド
	public void use() {
		System.out.println(getName() + "でこうげき!");
		System.out.println("敵に" + getAttackValue() + "のダメージ!");
	}
}
