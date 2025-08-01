package week3_RANMINWEN.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//ファイルを作成
		File file = new File("nikujaga.txt");

		//もしファイルがない場合　作成
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				//例外がある場合
				e.printStackTrace();
			}
		}

		//ファイルの書き込み
		try (FileWriter food = new FileWriter(file);
				BufferedWriter foodWriter = new BufferedWriter(food);) {

			//[carrot] [potato] [meat] [onion]を書き込む
			foodWriter.write("carrot");
			foodWriter.newLine();
			foodWriter.write("potato");
			foodWriter.newLine();
			foodWriter.write("meat");
			foodWriter.newLine();
			foodWriter.write("onion");

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
		} catch (IOException e) {
			System.out.println("書き込みが失敗した");
		}

		//ファイルのよみ込み
		try (FileReader food = new FileReader(file);
				BufferedReader foodReader = new BufferedReader(food);) {
			//改行した状態のまま出力する
			String line = foodReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = foodReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
		} catch (IOException e) {
			System.out.println("読み込みが失敗した");
		}
	}

}
