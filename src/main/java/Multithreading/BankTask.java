package Multithreading;

public class BankTask implements Runnable{
	private Practice account;
	private int ammount;
	public BankTask(Practice account, int ammount) {
		super();
		this.account = account;
		this.ammount = ammount;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withrawal(ammount);
		
	}
}
