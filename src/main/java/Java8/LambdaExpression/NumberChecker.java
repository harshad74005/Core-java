package Java8.LambdaExpression;

public interface NumberChecker {
	boolean number(int a);
	public static void main(String[] args) {
		NumberChecker isPositive = (a)-> a > 0;
		System.out.println("Number is positive : "+isPositive.number(5));
		System.out.println("Number is positive : "+isPositive.number(-5));
	}
}
