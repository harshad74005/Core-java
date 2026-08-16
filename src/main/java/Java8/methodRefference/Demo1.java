package Java8.methodRefference;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void printquare(int n)
	{
		System.out.println("Square is : "+n*2);
	}
	public static void main(String[] args) {
	
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		numbers.stream().forEach(Demo1::printquare);
	}
}
