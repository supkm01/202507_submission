package week2_shaominhao.practice2;

//Itemインターフェイスを実装する
public class Buki implements Item {
	////メンバー変数
	//武器の名前
	private String name;
	//武器の攻撃力
	private int defenceValue;

	//コンストラクタ
	public Buki(String name, int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	//get
	//武器の名前を返す
	public String getName() {
		return name;
	}

	//武器の攻撃力を返す
	public int getDefenceValue() {
		return defenceValue;
	}

	@Override
	public void use() {
		System.out.println(getName() + "でこうげき!");
		System.out.println("敵に" + getDefenceValue() + "のダメージ!");
	}

}
