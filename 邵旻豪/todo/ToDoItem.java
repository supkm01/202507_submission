package todo;

public class ToDoItem {
	//ToDoアイテムのタイトルを表します。
	private String title;
	//ToDoアイテムの詳細説明を表します。
	private String description;
	//ToDoアイテムが完了したかどうかを示すフラグです。完了している場合はtrue、未完了の場合はfalseです。
	private boolean completed;

	//コンストラクタ
	public ToDoItem(String title, String description) {
		this.title = title;
		this.description = description;
	}

	//ToDoアイテムのタイトルを返します。
	public String getTitle() {
		return title;
	}

	//ToDoアイテムの説明を返します。
	public String getDescription() {
		return description;
	}

	//ToDoアイテムが完了しているかどうかを返します。完了している場合はtrue、未完了の場合はfalseです。
	public boolean isCompleted() {
		return completed;
	}

	//ToDoアイテムを完了済みにマークします。completedフラグをtrueに設定します。
	public void markAsCompleted() {
		completed = true;
	}

	@Override
	public String toString() {
		return "ToDoItem [title=" + title + ", description=" + description + ", completed=" + completed + "]";
	}

}
