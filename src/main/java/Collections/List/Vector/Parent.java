package Collections.List.Vector;

import java.util.List;
import java.util.Vector;

public class Parent {
	public static void main(String[] args) {
		List<String> card = new Vector<String>();
		card.add("apple");
		card.add(null);
		card.add("banana");
//		card.addFirst();
		card.remove(1);
		card.set(1, "apple");
		System.out.println(card);
		
//		maintain insertion order
//		allow duplicates
//		allow null
//		it is thread safe it's method is syncronised that why he perform slow
	}

}
