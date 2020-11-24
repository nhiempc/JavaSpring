package Lession1.Activity11;

public class CreateThread {

    public static void  main(String[] args) {
        for (int i = 0; i < 50; i++){
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    System.out.println("Thread Interrupt!");
                }
            }).start();
        }
    }
}