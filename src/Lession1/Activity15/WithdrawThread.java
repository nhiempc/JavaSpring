package Lession1.Activity15;

public class WithdrawThread extends Thread {
    private Thread t;
    private String threadName;
    private long soTienRut;
    private Lession1.Activity15.BankAccount BankAccount;
    WithdrawThread( String name,BankAccount ba,long widthdrawAmount){
        threadName = name;
        soTienRut = widthdrawAmount;
        BankAccount = ba;
    }
    public void run(){
        try {
            BankAccount.withdraw(threadName,soTienRut);
        }catch (Exception e){
            System.out.println("Thread Interrupt!");
        }
    }
}
