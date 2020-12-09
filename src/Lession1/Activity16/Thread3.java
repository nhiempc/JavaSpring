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
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int max = sharedData.getMax();
                if(sharedData.getQuantity()>max){
                    max = sharedData.getQuantity();
                    sharedData.setMax(max);
                    sharedData.setNumMax(sharedData.getNum());
                }
            }
        }while (sharedData.checkAvaiable());
        System.out.println("Num Max = "+sharedData.getNumMax());
        System.out.println("Max = "+sharedData.getMax());
    }
}
