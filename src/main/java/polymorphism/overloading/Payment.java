package polymorphism.overloading;

public class Payment {

	void pay(String upiId)
	{
		System.out.println("Pay via upi");
	}
	void pay(int card)
	{
		System.out.println("pay via card");
	}
	void pay(double cash)
	{
		System.out.println("pay via cash");
	}
}
