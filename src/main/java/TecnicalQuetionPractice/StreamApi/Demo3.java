package TecnicalQuetionPractice.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Harshad");
		name.add("Shailesh");
		name.add("Amol");
		name.add("amol");
		
		name.stream().sorted().forEach(System.out::println);
	}
}
