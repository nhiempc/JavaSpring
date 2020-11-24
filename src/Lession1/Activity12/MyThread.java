package Lession1.Activity12;

public class MyThread {
    public static synchronized void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
        Thread2 th2 = new Thread2();
        th2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run(){
            try {
                Thread.sleep(3500);
                System.out.println("ABC");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
            try {
                Thread.sleep(6000);
                System.out.println("DEF");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
