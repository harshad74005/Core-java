package Java8.LambdaExpression;

public interface Calculate {

	int Calculator(int x,int y);
	public static void main(String[] args) {
		Calculate multiplication = (x,y)->x*y;
		System.out.println("Mulitiplication is : "+multiplication.Calculator(2, 5));
	}
}
