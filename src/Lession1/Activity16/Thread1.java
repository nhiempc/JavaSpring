package Lession1.Activity16;

public class Thread1 extends Thread{
    SharedData sharedData;
    public Thread1(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        int i = 0;
        do {
            synchronized (sharedData){
                i+=1;
                sharedData.setNum(i);
                System.out.println("Thread 1: Num = "+i);
                sharedData.setIndex(2);
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex()!=1&&sharedData.checkAvaiable()){
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }while (sharedData.checkAvaiable());
        synchronized (sharedData){
            System.out.println("Thread 1 was stopped!");
            //sharedData.notifyAll();
        }
    }
}
