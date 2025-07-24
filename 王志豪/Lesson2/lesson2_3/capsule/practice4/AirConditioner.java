package lesson2_3.capsule.practice4;

public class AirConditioner extends Cooler {

	//コンストラクタ
	public AirConditioner(int nowTemp) {
		super(nowTemp);
	}

	//メソッド
	public void adjust() {
		if (nowTemp < goalTemp) {
			this.nowTemp += 1;
			System.out.println("室温を1°上げました。");
		} else {
			super.adjust();
		}
	}

}
