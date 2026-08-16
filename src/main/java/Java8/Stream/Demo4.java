package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Harshad");
		name.add("Aniket");
		name.add("Shaylesh");
		name.add("Rupesh");
		name.add("Mudstir");
		
		name.stream().sorted().map((s)->s.length()).forEach(System.out::println);
	}
}
