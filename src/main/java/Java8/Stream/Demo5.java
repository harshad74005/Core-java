package Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Astralia");
		name.add("India");
		name.add("USA");
		name.add("Africa");
		name.add("England");
		
		List<String> filterCountries =name.stream().filter((a)->a.startsWith("A") || a.startsWith("a")).collect(Collectors.toList());
		System.out.println("Filter countries : "+filterCountries);
	}
}

