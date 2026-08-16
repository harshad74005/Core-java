package Java8.LambdaExpression;

import java.util.function.Predicate;

public interface Demo3 {
	int Number(int n);
	public static void main(String[] args) {
		Predicate<Integer> isGreter = (n)-> n > 100;
		System.out.println("Number is greter than 100 : "+isGreter.test(50));
		System.out.println("Number is greter than 100 : "+isGreter.test(150));
	}
	
//	It is use to check the condition and he return true or false 
//	inside predicate we one method this is boolean test();
}
