package Encapsulation;

public class Bank {
	
	String b_name;
	private double balance;
	
	public void setBalance(double balance)
	{
		if(balance > 0)
		{
//			this.balance=balance;
			this.balance = balance;
			System.out.println("balance added : "+balance);
		}
		else if(balance == 0)
		{
			System.out.println("0 is not accept");
		}
		else {
			System.out.println("negative balance");
		}
	}
}
