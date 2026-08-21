package TecnicalQuetionPractice;

import java.util.function.Supplier;

public class Demo4 {
public static void main(String[] args) {
	Supplier<Integer> otp = ()->(int)(Math.random()*9000)+1000;
	System.out.println("Otp generated : "+otp.get());
}
}
