package todolist;

import java.util.Scanner;

public class Main {
	private static final int MAX_ITEMS = 10;
	private static ToDoItem[] todoItems = new ToDoItem[MAX_ITEMS];
	private static int itemCount = 0;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			displayMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // 改行文字を消費

			switch (choice) {
			case 1:
				addItem();
				break;
			case 2:
				removeItem();
				break;
			case 3:
				markItemAsCompleted();
				break;
			case 4:
				displayItems();
				break;
			case 5:
				System.out.println("プログラムを終了します。");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("無効な選択です。1から5の数字を入力してください。");
			}
		}
	}

	private static void displayMenu() {
		System.out.println("\n=== ToDoリスト管理プログラム ===");
		System.out.println("1. ToDoアイテムを追加");
		System.out.println("2. ToDoアイテムを削除");
		System.out.println("3. ToDoアイテムを完了済みにする");
		System.out.println("4. ToDoリストを表示");
		System.out.println("5. 終了");
		System.out.print("選択してください (1-5): ");
	}

	private static void addItem() {
		if (itemCount >= MAX_ITEMS) {
			System.out.println("ToDoリストが満杯です。これ以上追加できません。");
			return;
		}

		System.out.print("タイトルを入力してください: ");
		String title = scanner.nextLine();
		System.out.print("説明を入力してください: ");
		String description = scanner.nextLine();

		todoItems[itemCount] = new ToDoItem(title, description);
		itemCount++;
		System.out.println("ToDoアイテムが追加されました。");
	}

	private static void removeItem() {
		if (itemCount == 0) {
			System.out.println("ToDoリストは空です。削除するアイテムがありません。");
			return;
		}

		displayItems();
		System.out.print("削除するアイテムの番号を入力してください (1-" + itemCount + "): ");
		int index = scanner.nextInt();
		scanner.nextLine(); // 改行文字を消費

		if (index < 1 || index > itemCount) {
			System.out.println("無効な番号です！");
			return;
		}

		// インデックスを0ベースに変換
		int actualIndex = index - 1;

		// アイテムを削除して後ろのアイテムを前に詰める
		for (int i = actualIndex; i < itemCount - 1; i++) {
			todoItems[i] = todoItems[i + 1];
		}
		todoItems[itemCount - 1] = null;
		itemCount--;
		System.out.println("アイテムが削除されました。");
	}

	private static void markItemAsCompleted() {
		if (itemCount == 0) {
			System.out.println("ToDoリストは空です。完了済みにするアイテムがありません。");
			return;
		}

		displayItems();
		System.out.print("完了済みにするアイテムの番号を入力してください (1-" + itemCount + "): ");
		int index = scanner.nextInt();
		scanner.nextLine(); // 改行文字を消費

		if (index < 1 || index > itemCount) {
			System.out.println("無効な番号です！");
			return;
		}

		todoItems[index - 1].markAsCompleted();
		System.out.println("アイテムが完了済みにマークされました。");
	}

	private static void displayItems() {
		if (itemCount == 0) {
			System.out.println("ToDoリストは空です。");
			return;
		}

		System.out.println("\n=== ToDoリスト ===");
		for (int i = 0; i < itemCount; i++) {
			System.out.println((i + 1) + ". " + todoItems[i].toString());
		}
	}
}
