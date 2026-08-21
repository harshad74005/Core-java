package TecnicalQuetionPractice;

import java.util.function.Function;

public class Demo2 {


	public static void main(String[] args) {
		Function<String,String> toUpper = (s)-> s.toUpperCase();
		System.out.println("Converting : "+toUpper.apply("harshad"));
	}
	
}
