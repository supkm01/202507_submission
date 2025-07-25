package week2_RANMINWEN.practice2;

//Item インタフェースを実装
public class Buki implements Item {
	//メンバー変数
	//武器名前
	private String name;
	//武器の攻撃力
	private int attackValue;

	//コンストラクタ
	Buki(String name, int attackValue) {
		this.name = name;
		this.attackValue = attackValue;
	}

	//武器名前を返す
	public String getName() {
		return name;
	}

	//武器の守備力を返す
	public int attackValue() {
		return attackValue;
	}

	//インターフェースを実装、武器名前と敵に与えるダメージを表示
	@Override
	public void use() {
		System.out.println(name + "でこうげき!");
		System.out.println("敵に" + attackValue + "のダメージ!");
	}

}
