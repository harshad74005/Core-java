package Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public interface Demo1 {
	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Amit");
		name.add("Aniket");
		name.add("Sachin");
		name.add("Harshad");
		
		name.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
		
		
		

	}
	
}
