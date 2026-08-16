package Java8.LambdaExpression;

import java.util.function.Supplier;

public interface Demo5 {
	public static void main(String[] args) {
		Supplier<String> random = ()-> "Hello";
		System.out.println(random.get());
	}
}
