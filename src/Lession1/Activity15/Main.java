package Lession1.Activity15;

public class Main {
    public static void main(String[] args) {
        BankAccount BankAccount = new BankAccount();
        WithdrawThread husbandThread = new WithdrawThread( "Husband",BankAccount,12000000);
        husbandThread.start();
        WithdrawThread wifeThread = new WithdrawThread( "Wife",BankAccount,3000000);
        wifeThread.start();
    }
}
