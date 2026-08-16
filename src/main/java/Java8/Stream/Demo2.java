package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public interface Demo2 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(3);
		
		num.stream().map((a)->a*2).forEach(System.out::println);
	}
}
