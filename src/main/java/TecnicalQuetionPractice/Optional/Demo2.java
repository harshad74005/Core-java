package TecnicalQuetionPractice.Optional;

import java.util.Optional;

public class Demo2 {
public static void main(String[] args) {
		Optional<String> name= Optional.of("java devloper");
		if (name.isPresent()) {
			System.out.println(name.get());
		}
		else
		{
			name.orElse("Guest");
		}
}
}
