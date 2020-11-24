package Lession1.Activity14;

import java.util.HashMap;
import java.util.Random;

public class ThreadSynchronization {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run(){
        HashMap<String, String> days = new HashMap<String, String>();
        days.put("Monday", "Thứ 2");
        days.put("Tuesday", "Thứ 3");
        days.put("Wednesday", "Thứ 4");
        days.put("Thursday", "Thứ 5");
        days.put("Friday", "Thứ 6");
        days.put("Saturday", "Thứ 7");
        days.put("Sunday", "Chủ nhật");
        while (true){
            try {
                Thread1.sleep(2000);
                Object[] crunchifyKeys = days.keySet().toArray();
                Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
                System.out.println(key);
                Thread2 th2 = new Thread2(key.toString(),days.get(key));
                th2.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread{
    String day_en;
    String day_vi;
    Thread2(String day_en,String day_vi){
        this.day_en = day_en;
        this.day_vi = day_vi;
    }
    @Override
    public void run(){
        while (true) {
            try {
                System.out.println(day_vi);
                System.out.println("---------");
                Thread2.currentThread().stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
