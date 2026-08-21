package Multithreading;

public class AtmDemo {
    public static void main(String[] args) {
        ATM myAtmAccount = new ATM();

        AtmTask task = new AtmTask(myAtmAccount, 3000);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}