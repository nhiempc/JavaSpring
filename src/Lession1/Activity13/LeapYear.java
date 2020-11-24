package Lession1.Activity13;

import java.util.Random;

public class LeapYear {
    public synchronized static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run(){
        while (true){
            try {
                Thread1.sleep(2000);
                Random rd = new Random();
                int year = 1000 + rd.nextInt(9000);
                System.out.println(year);
                Thread2 th2 = new Thread2(year);
                th2.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread{
    int years;
    Thread2(int year){
        this.years = year;
    }
    @Override
    public void run(){
        while (true) {
            try {
            if(years%4==0&&years!=0){
                System.out.println("Năm "+years+" là năm nhuận");
            }
            else{
                System.out.println("Năm "+years+" là năm thường");
            }
            Thread2.currentThread().stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
