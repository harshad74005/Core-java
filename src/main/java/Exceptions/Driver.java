package Exceptions;

public class Driver {

	public static void main(String[] args) {
		Product p = new Product();
		try {
			p.Inventary(25, 20);
		} catch (OutofStockException o) {
			// TODO: handle exception'
			System.out.println("The product is not available");
		}
		finally {
			System.out.println("The Inventary done........");
		}
	}
}
