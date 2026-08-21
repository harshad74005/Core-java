package Multithreading;

public class Demo {
	public static void main(String[] args) {
		Practice account = new Practice();
		BankTask task = new BankTask(account, 200);
		
		Thread t1 = new Thread(task,"Frend-1");
		Thread t2 = new Thread(task,"Freend-2");
		t1.start();
		t2.start();
}
}
