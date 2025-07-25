package week2_shaominhao.practice2;

//Itemインターフェイスを実装する
public class Armor implements Item {
	//メンバー変数
	//アーマーの名前
	private String name;
	//アーマーの守備力
	private int defenceValue;

	//コンストラクタ
	public Armor(String name, int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	//get
	//アーマーの名前を返す
	public String getName() {
		return name;
	}

	//アーマーの守備力を返す
	public int getDefenceValue() {
		return defenceValue;
	}

	//インターフェイスを実装
	@Override
	public void use() {
		System.out.println(getName() + "を身に着けた");

		System.out.println("守備力が" + getDefenceValue() + "上がった");
	}

}
