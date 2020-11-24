package Lession1;

public class WithdrawThread extends Thread {
    private Thread t;
    private String threadName;
    private long soTienRut;
    private BankAccount BankAccount;
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
