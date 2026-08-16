package Java8.methodRefference;

import java.util.ArrayList;
import java.util.List;

public class Demo2{

	void toUppercase(String s)
	{
		System.out.println("Converteed to upper : "+s.toUpperCase());
	}
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("harshad");
		name.add("amit");
		name.add("shaylesh");
		Demo2 d = new Demo2();
		name.stream().forEach(d::toUppercase);
	}
}
