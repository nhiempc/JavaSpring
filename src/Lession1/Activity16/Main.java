package Lession1.Activity16;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Thread1 thread1 = new Thread1(sharedData);
        thread1.start();
        Thread2 thread2 = new Thread2(sharedData);
        thread2.start();
        Thread3 thread3 = new Thread3(sharedData);
        thread3.start();
    }
}
