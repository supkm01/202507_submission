package todolist;

public class ToDoItem {
	private String title;
	private String description;
	private boolean completed;

	public ToDoItem(String title, String description) {
		this.title = title;
		this.description = description;
		this.completed = false;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void markAsCompleted() {
		completed = true;
	}

	@Override
	public String toString() {
		String status = completed ? "[完了]" : "[未完了]";
		return status + " " + title + ": " + description;
	}
}
