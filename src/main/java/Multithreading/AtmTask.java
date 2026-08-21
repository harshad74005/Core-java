package Multithreading;

public class AtmTask implements Runnable {
    private ATM atm;
    private int amountToWithdraw;

    public AtmTask(ATM atm, int amountToWithdraw) {
        this.atm = atm;
        this.amountToWithdraw = amountToWithdraw;
    }

    @Override
    public void run() {
        atm.withdraw(amountToWithdraw);
    }
}