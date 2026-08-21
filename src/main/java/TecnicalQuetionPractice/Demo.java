package TecnicalQuetionPractice;

import java.util.function.Predicate;

public class Demo {

	
	public static void main(String[] args) {
		Predicate<Integer> Isodd = (a)->a%2==0;
		System.out.println("Is Odd Number : "+Isodd.test(5));
		System.out.println("Is Odd Number : "+Isodd.test(2));
	}
}
