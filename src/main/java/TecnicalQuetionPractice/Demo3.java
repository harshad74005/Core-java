package TecnicalQuetionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo3 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Rahul");
		name.add("amol");
		name.add("subhash");
		name.add("Harshad");
		
		Consumer<String> ghumo = (n)->System.out.println("Hello "+n);
		name.forEach(ghumo);
	}
}
