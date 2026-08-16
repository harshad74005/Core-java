package Java8.LambdaExpression;

import java.util.function.Predicate;

public interface Even {
	int Evens(int n);
	public static void main(String[] args) {
		
		Predicate<Integer> num = (n)->n%2==0;
		System.out.println("The number is even : "+num.test(5));
		System.out.println("The Number is even : "+num.test(2));
		
	
		
	}
}
