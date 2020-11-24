package Lession1;

public class BankAccount {
    private long amount = 20000000;
    long newAmount;
    public synchronized void withdraw(String threadName, long withdrawAmount){
        if(withdrawAmount>=amount){
            newAmount = amount;
            System.out.println(threadName+" need: "+withdrawAmount);
            System.out.println(threadName+" withdraw error!");
        }
        else {
            newAmount = amount - withdrawAmount;
            System.out.println(threadName+" need: "+withdrawAmount);
            System.out.println(threadName+" withdraw success: "+withdrawAmount);
            amount = newAmount;
        }
        System.out.println(threadName+" see balance: "+newAmount);
    }
}
