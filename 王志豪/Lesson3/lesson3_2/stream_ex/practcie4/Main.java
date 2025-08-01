package lesson3_2.stream_ex.practcie4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//リスト作成
		List<Teacher> teacher =new ArrayList<Teacher>();
		teacher.add(new Teacher("Sasaki",50));
		teacher.add(new Teacher("Tanaka",24));
		teacher.add(new Teacher("Suzuki",39));
		
		//streamで出力
		
		teacher.stream()
				.sorted((s1,s2) -> s1.getAge() -s2.getAge())
				.forEach(a -> System.out.println(teacher));
				
	}

}
