package week2_oushigo.practice2;

public class Armor implements Item {
	//インスタンス変数
	//アーマーの名前とアーマーの守備力
	private String name;
	private int defenceValue;

	//アーマーの名前と守備力のコンストラクタ
	public Armor(String name, int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	//getメソッド
	public String getName() {
		return name;
	}

	public int getDefenceValue() {
		return defenceValue;
	}

	//インタフェースの実装メソッド
	public void use() {
		System.out.println(getName() + "を身に着けた");
		System.out.println("守備力が" + getDefenceValue() + "上がった");
	}

}
