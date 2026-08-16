package Java8.LambdaExpression;

import java.util.function.Function;

public interface Demo {
	String user(String s);
	public static void main(String[] args) {
		Function<String, String> toUppercase = (s)->s.toUpperCase();
		System.out.println("Converting upperCase : "+toUppercase.apply("harshad"));
	}
}
