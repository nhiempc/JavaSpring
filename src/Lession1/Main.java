package Lession1;

public class Main {
    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount();
        WithdrawThread husbandThread = new WithdrawThread( "Husband",BankAccount,15000000);
        husbandThread.start();
        WithdrawThread wifeThread = new WithdrawThread( "Wife",BankAccount,20000000);
        wifeThread.start();
    }
}
