package lesson3_3.file_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice1 {

	public static void main(String[] args) {
		// もしファイルが存在していなかったら、ファイルの作成をする（practice3.txt）
		File file = new File("practice3.txt");

		if (!file.exists()) {
			try {
				//ファイルを作成
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 存在していた場合は、ファイルのサイズを出力する
		} else {
			System.out.println(file.length());
		}
		// ファイル書き込み操作
		//　　書き込む内容：寿司、焼肉、ハンバーグ（改行あり）
		try (
				//書き込む
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fileWriter);) {
			//ファイルに書き込む
			bw.write("寿司");
			bw.newLine();
			bw.write("焼肉");
			bw.newLine();
			bw.write("ハンバーグ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ファイル読み込み操作
		//　　ファイルに書いてあるままの内容をコンソールに表示する（改行あり）
		try (
				//書き込む
				FileReader fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);) {
			//ファイルに書き込む
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
