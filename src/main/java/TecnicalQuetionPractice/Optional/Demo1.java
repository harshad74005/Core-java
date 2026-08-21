package TecnicalQuetionPractice.Optional;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {
		String s = null;
		Optional<String> s1 = Optional.ofNullable(s);
		
		String s2 = s1.orElse("guest");
		System.out.println("Hello , "+s2);
	}
}
