package Exceptions;

class ExceptionPropogation {

	int a = 0 ;
	int b =2;
	void paymentProcess()
	{
		int tax = b/a;
	}
	
	void paymentProcess2()
	{
		paymentProcess();
	}

	public static void main(String[] args) {
		ExceptionPropogation e = new ExceptionPropogation();
		try {
			e.paymentProcess2();
		} catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println("handeleed by main");
		}
	}
}
