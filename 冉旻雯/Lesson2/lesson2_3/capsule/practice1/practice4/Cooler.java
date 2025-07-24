package lesson2_3.capsule.practice4;

//親クラス
public class Cooler {
	//現在の室温
	protected int nowTemp;
	// 目標の室温
	protected int goalTemp;

	//コンストラクタ:
	//現在の室温を受け取り
	public Cooler(int nowTemp) {
		this.nowTemp = nowTemp;
	}

	//目標の室温を設定する
	public void setGoalTemp(int goalTemp) {
		this.goalTemp = goalTemp;

	}

	public void adjust() {
		if (nowTemp > goalTemp) {
			System.out.println( "室温を1°下げました。" );
			nowTemp = nowTemp -1;
		}else {
			System.out.println( "適温です" );
		}

	}

}
