package Lession1.Activity16;

public class Thread2 extends Thread {
    SharedData sharedData;
    public Thread2(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        do{
            synchronized (sharedData){
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex()!=2&&sharedData.checkAvaiable()){
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int num = sharedData.getNum();
                int dem  = 0;
                for (int i=1;i<=num;i++){
                    if(num%i==0){
                        dem++;
                    }
                }
                sharedData.setQuantity(dem);
                sharedData.setIndex(3);
                System.out.println("Thread 2: Quatity = "+dem);
            }
        }while (sharedData.checkAvaiable());
        synchronized (sharedData){
            System.out.println("Thread 2 was stopped!");
            //sharedData.notifyAll();
        }
    }
}
