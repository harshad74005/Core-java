package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total amount : ");
	int totalAmount = sc.nextInt();
	System.out.println("Enter total items : ");
	int totalItems = sc.nextInt();

	
	int discount;
	try {
		discount = totalAmount / totalItems;
		System.out.println("the descount is : "+discount);
	} catch (ArithmeticException e) {
		System.out.println("total item 0 asu shakat nahi");
	}
	catch (NullPointerException n) {
		// TODO: handle exception
		System.out.println("tumhi blank theu shakat nahi");
	}
	catch (InputMismatchException i) {
		// TODO: handle exception
		System.out.println("krupaya fact number taka");
	}
	finally {
		System.out.println("calculation process done..........");
	}

}
	
}
