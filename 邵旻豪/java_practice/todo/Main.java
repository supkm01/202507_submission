package todo;

import java.util.Scanner;

public class Main {
	//ToDoアイテムの配列を格納するフィールドです。ToDoアイテムは最大10個まで保持できます。
	private static final ToDoItem[] todoItems = new ToDoItem[10];
	//現在のToDoアイテムの数を追跡するためのフィールドです。これにより、ToDoアイテムがどれだけ追加されたかを把握できます。
	private static int itemCount;

	public static void main(String[] args) {
		//- コマンドラインからのユーザー入力を処理します。
		//- メニューの表示、ユーザーの選択肢の処理、プログラムの終了などを行います。
		//- whileループを使用して、ユーザーがプログラムを終了するまで継続的にメニューを表示し、ユーザー入力を待ちます。
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// メニュー表示
			System.out.println("Choose an option:");
			System.out.println("1. Add ToDo Item");
			System.out.println("2. Remove ToDo Item");
			System.out.println("3. Mark ToDo Item as Completed");
			System.out.println("4. Display ToDo List");
			System.out.println("5. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1: // Add
				if (itemCount >= 10) {
					break;
				}
				System.out.print("Enter title: ");
				String title = scanner.nextLine();
				System.out.print("Enter description: ");
				String description = scanner.nextLine();
				todoItems[itemCount++] = new ToDoItem(title, description);
				break;

			case 2: // Remove
				displayItems();
				if (itemCount == 0)
					break;
				System.out.print("Enter index of item to remove: ");
				int removeLine = scanner.nextInt();
				removeItem(removeLine);
				break;

			case 3: // Mark completed
				displayItems();
				if (itemCount == 0)
					break;
				System.out.print("Enter index of item to mark as completed: ");
				int completeLine = scanner.nextInt();
				markItemAsCompleted(completeLine);
				break;

			case 4: // Display
				displayItems();
				break;

			case 5: // Exit
				scanner.close();
				System.exit(0);
				return;

			default:
				break;
			}
		}

	}

	//	- 指定されたインデックスにあるToDoアイテムを削除します。削除されたToDoアイテムの後ろのアイテムは、1つ前に移動します。
	//	- インデックスが範囲外の場合は、"Invalid index!"というエラーメッセージを表示します。
	public static void removeItem(int index) {

		if (index < 0 || index >= itemCount) {
			System.out.println("Invalid index!");
			return;
		}
		for (int i = index; i < itemCount - 1; i++) {
			todoItems[i] = todoItems[i + 1];
		}
		todoItems[--itemCount] = null;

		return;
	}

	//	- 指定されたインデックスにあるToDoアイテムを完了済みにマークします。
	//	- インデックスが範囲外の場合は、"Invalid index!"というエラーメッセージを表示します。
	public static void markItemAsCompleted(int index) {
		if (index < 0 || index >= itemCount) {
			System.out.println("Invalid index!");
			return;
		}
		todoItems[index].markAsCompleted();
		System.out.println("完了済み");
	}

	// ToDoリスト全体を表示します。ToDoアイテムが1つもない場合は、"ToDo List is empty."というメッセージを表示します。
	public static void displayItems() {
		if (itemCount == 0) {
			System.out.println("ToDo List is empty.");
			return;
		}
		System.out.println("ToDo List:");
		for (int i = 1; i < itemCount; i++) {
			System.out.println(i + todoItems[i].toString());
		}
	}

}
