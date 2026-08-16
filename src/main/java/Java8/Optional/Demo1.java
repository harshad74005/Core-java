package Java8.Optional;

import java.util.Optional;

public class Demo1 {

	
	public static Optional<String> getEmail(int id)
	{
		if(id == 7)
		{
		return Optional.of("Harshad@gmail.com");
		}
		return Optional.empty();
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Optional<String> email1 = d.getEmail(7);
		System.out.println("Email is found :"+email1+" "+email1.orElse("Guest mode"));
		Optional<String> email2 = d.getEmail(70);
		System.out.println("Email is found :"+email2+" "+email2.orElse("Guest mode"));
	}
}
