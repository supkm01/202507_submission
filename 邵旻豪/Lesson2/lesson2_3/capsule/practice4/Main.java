package lesson2_3.capsule.practice4;

public class Main {

	public static void main(String[] args) {
		Cooler cooler = new Cooler(28);
		AirConditioner aircon = new AirConditioner(28);

		//冷房の設定温度を27度にする
		cooler.goalTemp = 27;
		//冷房が温度調節をする
		cooler.adjust();
		//冷房が温度調節をする
		cooler.adjust();

		//エアコンの設定温度を27度にする
		aircon.goalTemp = 27;
		//エアコンが温度調節をする
		aircon.adjust();
		//エアコンの設定温度を28度にする
		aircon.goalTemp = 28;
		//エアコンが温度調節をする（2回）
		aircon.adjust();
		aircon.adjust();

	}

}
