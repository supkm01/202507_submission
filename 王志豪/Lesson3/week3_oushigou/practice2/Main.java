package week3_oushigou.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Fileクラスをimportしてからファイルを指定する
		File file = new File("nikujaga.txt");
		// もしnikujaga.txtが存在していなかった場合、nikujaga.txtを作成する
		if (!file.exists()) {
			try {
				// ファイル作成
				file.createNewFile();
			} catch (IOException e) {
				// エーラ詳細の反映
				e.printStackTrace();
			}
		} else {
			// ファイルが存在する場合
			System.out.println("");
		}

		try ( // try-with-resource
				FileWriter filewriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(filewriter);) {
			// 文字列をファイルに書き込み後改行
			bw.write("carrot");
			bw.newLine();
			bw.write("potato");
			bw.newLine();
			bw.write("meat");
			bw.newLine();
			bw.write("onion");
			bw.newLine();

		} catch (FileNotFoundException e) {
			// ファイルが見つからなかった場合
			System.out.println("ファイルが見つかりませんできました。");
		} catch (IOException i) {
			System.out.println("読み込み失敗");
			// エーラの詳細を表示する
			i.printStackTrace();
		}

		// ファイルの読み込み操作
		try (
				// close処理が必要な処理
				FileReader fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);) {
			// 一行ずつ出力する
			String line = br.readLine();
			while (line != null) {
				// 内容を出力
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんできました。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。");
			e.printStackTrace();
		}

	}

}
