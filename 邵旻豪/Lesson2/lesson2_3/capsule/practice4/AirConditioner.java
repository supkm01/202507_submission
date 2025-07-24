package lesson2_3.capsule.practice4;

//Cooler クラスを継承します。
public class AirConditioner extends Cooler {
	//コンストラクタ
	public AirConditioner(int nowTemp) {
		super(nowTemp);
	}

	//冷却処理を行うメソッド。
	@Override
	public void adjust() {
		if (nowTemp < goalTemp) {
			nowTemp += 1;
			System.out.println("室温を1°上げました。");
		}
		//それ以外の場合は親クラスの adjust メソッドを呼び出します。
		else {
			super.adjust();
		}
	}

}
