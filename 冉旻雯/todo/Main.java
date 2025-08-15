package todo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ToDoアイテムの配列を格納
		//ToDoアイテムは最大10個まで
		ToDoItem[] todoItems = new ToDoItem[10];
		int itemCount = 0;

		//コマンドラインからのユーザー入力を処理します
		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("Choose an option:");
			System.out.println("1. Add ToDo Item");
			System.out.println("2. Remove ToDo Item");
			System.out.println("3. Mark ToDo Item as Completed");
			System.out.println("4. Display ToDo List");
			System.out.println("5. Exit");

			scanner.close();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

	public static void removeItem(int index) {

	}

	public static void markItemAsCompleted(int index) {

	}
	
	public static void displayItems() {
		if( ? = 0) {
			System.out.println("ToDo List is empty.");	
		}
		
	}

}
