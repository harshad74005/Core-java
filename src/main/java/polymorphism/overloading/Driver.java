package polymorphism.overloading;

public class Driver {

	public static void main(String[] args) {
		Payment p = new Payment();
		p.pay(256);
		p.pay(5633.00);
		p.pay("hello");
	}
}
