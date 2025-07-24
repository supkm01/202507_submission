package lesson2_3.capsule.practice4;

//子クラス
public class AirConditioner extends Cooler {
	//コンストラクタ
	//現在の室温を受け取り
	public AirConditioner(int nowTemp) {
		super(nowTemp);
	}

	//冷却処理を行う
	public void adjust() {
		// nowTemp が goalTemp よりも低い
		if (nowTemp < goalTemp) {
			System.out.println("室温を1°上げました。");
			nowTemp = nowTemp + 1;
		} else {
			//親クラスの adjust メソッドを呼び出し
			super.adjust();
		}

	}

}
