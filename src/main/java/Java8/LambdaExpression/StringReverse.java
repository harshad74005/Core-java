package Java8.LambdaExpression;

import java.util.List;

public interface StringReverse {

	String reverse(String s);
	public static void main(String[] args) {
		
	
		StringReverse isReverse = (h)->new	StringBuilder(h).reverse().toString();
		System.out.println("Reverse : "+isReverse.reverse("harshad"));
	}
}
