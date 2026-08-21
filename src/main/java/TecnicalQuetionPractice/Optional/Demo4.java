package TecnicalQuetionPractice.Optional;

import java.util.Optional;

public class Demo4 {
public static void main(String[] args) {
	Optional<String> empty = Optional.empty();
	if(empty.isEmpty())
	{
		System.out.println(empty.orElseGet(()->"Alternativ value"));
	}
}
}
