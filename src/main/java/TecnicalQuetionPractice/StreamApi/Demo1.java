package TecnicalQuetionPractice.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(15);
	numbers.add(20);
	numbers.add(25);
	numbers.add(30);
	
	numbers.stream().filter((a)->a%2==0).forEach(System.out::println);
	
}
}
