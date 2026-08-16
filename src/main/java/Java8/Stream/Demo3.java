package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
public static void main(String[] args) {
	List<Integer> num = new ArrayList<Integer>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	
	num.stream().filter((s)->s%2==0).map((s)->s*3).forEach(System.out::println);
}
}
