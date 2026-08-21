package Multithreading;

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public  void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        
        System.out.println(threadName + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " - Balance is sufficient. Processing withdrawal...");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;
            System.out.println(threadName + " - Withdrawal successful! Remaining Balance: " + balance);
        } else {
            System.out.println(threadName + " - Sorry! Insufficient balance.");
        }
        System.out.println("--------------------------------------------------");
    }
}

class BankTask implements Runnable {
    private Account account;
    private int amountToWithdraw;

    public BankTask(Practice account2, int amountToWithdraw) {
        this.account = account2;
        this.amountToWithdraw = amountToWithdraw;
    }

    public BankTask(Practice account2, int amountToWithdraw2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void run() {
        account.withdraw(amountToWithdraw);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account myAccount = new Account();

        BankTask task = new BankTask(myAccount, 500);

        Thread t1 = new Thread(task, "Husband-Thread");
        Thread t2 = new Thread(task, "Wife-Thread");

        t1.start();
        t2.start();
    }
}