package Java8.LambdaExpression;

import java.util.function.Consumer;

public interface Demo4 {
	public static void main(String[] args) {
		Consumer<String> printText = s -> System.out.println(s);
		printText.accept("Hello Harshad Welcome to Software World");
	}
}
