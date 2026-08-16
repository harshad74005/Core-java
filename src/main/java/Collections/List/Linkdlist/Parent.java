package Collections.List.Linkdlist;

import java.util.LinkedList;
import java.util.List;

public class Parent {

	public static void main(String[] args) {
		List<String> card = new LinkedList<String>();
		card.add("Apple");
		card.add(null);
		card.add("Apple");
		
		card.addFirst("orange");
		card.addLast(null);
		card.removeFirst();
		card.set(1, "banana");
		card.size();
		System.out.println(card);
		
//		maintain insertion order
//		allow duplicates
//		allow null values
//		best for frequently inserting and deleting
	}
}
