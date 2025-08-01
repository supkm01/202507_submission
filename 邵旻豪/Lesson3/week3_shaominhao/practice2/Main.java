package week3_shaominhao.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// ファイルクラスを使ってファイルを指定する
		File file = new File("nikujaga.txt");
		//もしファイルが存在していなかった場合
		if (!file.exists()) {
			//ファイルを作成し
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//ファイルの書き込み操作
		//try-with-resourse
		try (
				//close処理が必要な処理
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fileWriter);) {
			//文字列をファイルに書き込む
			bw.write("carrot");
			//改行
			bw.newLine();
			bw.write("potato");
			bw.newLine();
			bw.write("meat");
			bw.newLine();
			bw.write("onion");
		} catch (FileNotFoundException e) {
			//出力
			System.out.println("ファイルが見つかりませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ファイルの読み込み操作
		//try-with-resourse
		try (
				//close処理が必要な処理
				FileReader fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);) {
			// 一行ずつ書いた内容を改行の状態でコンソールに出力する
			String line = br.readLine();
			while (line != null) {
				//内容を出力
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			//出力
			System.out.println("ファイルが見つかりませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
