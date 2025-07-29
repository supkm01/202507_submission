package lesson3_2.stream_ex.practcie2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("date");
		list.add("elderberry");
		list.add("fig");
		list.add("grape");
		
		list.stream()
			.filter(p -> p.length() >= 5 && p.startsWith("e"))
			.sorted()
			.collect(Collectors.toList());
			
		System.out.println(list);
		

	}

}
