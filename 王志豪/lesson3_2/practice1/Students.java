package lesson3_2.practice1;

public class Students {
	// メンバ変数
	private String name;
	private int age;
	private String Id;

	//コンストラクタ
	public Students(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		Id = id;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", Id=" + Id + "]";
	}
	
	
}
