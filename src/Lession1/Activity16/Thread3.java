package Lession1.Activity16;

public class Thread3 extends Thread {
    SharedData sharedData;
    public Thread3(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        do{
            synchronized (sharedData){
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex()!=3&&sharedData.checkAvaiable()){
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int max = sharedData.getMax();
                System.out.println("Thread 3 is running...");
                if(sharedData.getQuantity()>=max){
                    max = sharedData.getQuantity();
                    sharedData.setMax(max);
                    sharedData.setNumMax(sharedData.getNum());
                }
                sharedData.setIndex(1);
            }
        }while (sharedData.checkAvaiable());
        System.out.println("Num Max = "+sharedData.getNumMax());
        System.out.println("Max Quantity = "+sharedData.getMax());
        synchronized (sharedData){
            System.out.println("Thread 3 was stopped!");
            //sharedData.notifyAll();
        }
    }
}
