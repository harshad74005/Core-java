package Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();
	numbers.add(45);
	numbers.add(67);
	numbers.add(23);
	numbers.add(89);
	numbers.add(12);
	numbers.add(35);
	
	List<Integer> filterNumbers = numbers.stream().filter(a->a>50).collect(Collectors.toList());
	System.out.println("Filter Numbers List : "+filterNumbers);
}
}
