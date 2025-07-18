package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		Student tarou=new Student("タロウ",80,75,90);
		Student hanako=new Student("ハナコ",90,70,80);
		tarou.show();
		hanako.show();
		
		Student[]students=new Student[2];
		students[0]=new Student("タロウ",80,75,90);
		students[1]=new Student("ハナコ",90,70,80);
		students[0].show();
		students[1].show();
	}

}
