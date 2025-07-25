package week2_RANMINWEN.practice2;

//Item インタフェースを実装
public class Armor implements Item {
	//メンバー変数
	//アーマー名前
	private String name;
	//アーマーの守備力
	private int defenceValue;

	//コンストラクタ
	Armor(String name, int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	//アーマー名前を返す
	public String getName() {
		return name;
	}

	//アーマーの守備力を返す
	public int getDefenceValue() {
		return defenceValue;
	}

	//インターフェースを実装、アーマー名前とアーマーの守備力の上昇
	@Override
	public void use() {
		System.out.println(name + "を身に着けた");
		System.out.println("守備力が" + defenceValue + "上がった");
	}

}
