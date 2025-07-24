package lesson2_3.capsule.practice4;

public class Cooler {
	//メンバー変数
	// 現在の室温を保持するための整数型フィールド。
	protected int nowTemp;
	//目標の室温を保持するための整数型フィールド。
	protected int goalTemp;

	//コンストラクタ
	public Cooler(int nowTemp) {
		this.nowTemp = nowTemp;
	}

	//目標の室温を設定するメソッド。引数として目標の室温を受け取り、goalTemp フィールドを更新します。
	public void setGoalTemp(int goalTemp) {
		this.goalTemp = goalTemp;
	}

	// 冷却処理を行うメソッド
	public void adjust() {
		if (nowTemp > goalTemp) {
			nowTemp -= 1;
			System.out.println("室温を1°下げました。");
		} else {
			System.out.println("適温です");
		}
	}

}
