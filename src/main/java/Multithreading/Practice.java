package Multithreading;

class Practice {
    // इथे बॅलन्स सुरुवातीला १००० किंवा १०००० सेट कर!
    private int balance = 1000; 

    public int getBalance() {
        return balance;
    }

    synchronized void withrawal(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is trying to withdraw: " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " - Process...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance - amount;
            System.out.println(threadName + " - Success! Remaining Balance: " + balance);
        } else {
            System.out.println(threadName + " - Insufficient balance");
        }
        System.out.println("--------------------------------------------------");
    }
}