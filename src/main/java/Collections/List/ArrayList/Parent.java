package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Parent {

	
	public static void main(String[] args) {
		List<Integer> ratings = new ArrayList<Integer>();
		ratings.add(5);
		ratings.add(2);
		ratings.add(2);
		ratings.add(null);
		ratings.remove(2);
		System.out.println(ratings.get(2));
		ratings.set(2, null);
		ratings.addFirst(10);
		System.out.println(ratings);
		
//		maintain insertion order
//		allow duplicates values
//		allow multiple null values
//		best for frequently reading and retrive data
	}
}
