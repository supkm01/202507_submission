package lesson3_2.stream_ex.practice1;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// マップの宣言
		Map<String, Person> personMap = new HashMap<String, Person>();

		//データの挿入
		personMap.put("tanaka",new Person("tanaka", 28));
		personMap.put("suziki",new Person("suziki", 25));
		personMap.put("izawa",new Person("izawa", 32));

		
		//井澤さんのデータがあるか
		for(String data : personMap.keySet()) {
			if(personMap.keySet().equals("izawa") ) {
				System.out.println("井澤はいます。");
			}else {
				System.out.println("井澤はいません。");
			}
			
		}
		
		//名前と年齢を表示
		for(String data : personMap.keySet()) {
			System.out.println();
			
		}
	}

}
