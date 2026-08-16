package Java8.LambdaExpression;

public interface StringJoiner {
	String join(String a,String b);
	public static void main(String[] args) {
		
		StringJoiner isJoin=(a,b)->a+" "+b;
		System.out.println("Concatination : "+isJoin.join("harshad", "Developer"));
	}
}
