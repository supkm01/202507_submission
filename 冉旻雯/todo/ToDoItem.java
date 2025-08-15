package todo;

public class ToDoItem {
	//メンバ変数
	//ToDoアイテムのタイトル
	private String title;
	//ToDoアイテムの詳細説明
	private String description;
	//ToDoアイテムが完了したかどうかを示す
	private boolean completed;

	//コンストラクタ
	ToDoItem(String title, String description, boolean completed) {
		super();
		this.title = title;
		this.description = description;
		//デフォルトでfalseに設定されます
		this.completed = false;
	}

	//getter
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	//toString
	public void markAsCompleted() {
		//completedフラグをtrueに設定します。
		this.completed = true;
	}

	@Override
	public String toString() {
		return "ToDoItem [title=" + title + ", description=" + description + ", completed=" + completed + "]";
	}

}
