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
		// Fileのインスタンス生成
		File file = new File("practice3.txt");

		if (!file.exists()) {
			// もしファイルが存在していなかったら、ファイルの作成をする（practice3.txt）
			try {
				file.createNewFile();
				//絶対パスを出力
				System.out.println(file.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// 存在していた場合は、ファイルのサイズを出力する
			System.out.println(file.length());
		}

		// ファイル書き込み操作
		try (
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fileWriter)) {
			//　　書き込む内容：寿司、焼肉、ハンバーグ（改行あり）
			bw.write("寿司");
			bw.newLine();
			bw.write("焼肉");
			bw.newLine();
			bw.write("ハンバーグ");
			bw.newLine();
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんできました。");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました。");
			e.printStackTrace();
		}

		// ファイル読み込み操作
		//　　ファイルに書いてあるままの内容をコンソールに表示する（改行あり）
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fileReader);) {
			String line = br.readLine();
			while (line != null) {
				//内容を出力
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
