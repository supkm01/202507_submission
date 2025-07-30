package lesson3_3.file_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) {
		File file = new File("practice3.txt");
		// もしファイルが存在していなかったら
		if (!file.exists()) {
			//、ファイルの作成をする（practice3.txt）
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			// 存在していた場合は、ファイルのサイズを出力する
			System.out.println(file.length());
		}

		// ファイル書き込み操作
		try (FileWriter food = new FileWriter(file);
				BufferedWriter foodWriter = new BufferedWriter(food);) {

			//　　書き込む内容：寿司、焼肉、ハンバーグ（改行あり）
			foodWriter.write("寿司");
			foodWriter.newLine();
			foodWriter.write("焼肉");
			foodWriter.newLine();
			foodWriter.write("ハンバーグ");

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
		} catch (IOException e) {
			System.out.println("書き込みに失敗しました。");
		}

		// ファイル読み込み操作
		try (FileReader food = new FileReader(file);
				BufferedReader foodReader = new BufferedReader(food);) {
			//　　ファイルに書いてあるままの内容をコンソールに表示する（改行あり）
			String line = foodReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = foodReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。");
		}
	}

}
