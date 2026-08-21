package Multithreading;

public class ATM {
    private int balance = 5000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " - Trying to withdraw: " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " - Balance is sufficient. Processing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - amount;
            System.out.println(threadName + " - Success! Remaining Balance: " + balance);
        } else {
            System.out.println(threadName + " - Insufficient Balance!");
        }
        System.out.println("--------------------------------------------------");
    }
}