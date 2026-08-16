package Java8.LambdaExpression;

public interface StringLength {

	int getLength(String s);
	public static void main(String[] args) {
		
		StringLength Length = (s)-> s.length();
		System.out.println("Length is : "+Length.getLength("harshad"));
	}
}
