package Lession1.Activity16;

public class SharedData {
    int num;
    int numMax = 0;
    int quantity;
    int max = 0;

    public int getNum() {
        return num;
    }

    public SharedData setNum(int num) {
        this.num = num;
        return this;
    }

    public int getNumMax() {
        return numMax;
    }

    public SharedData setNumMax(int numMax) {
        this.numMax = numMax;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SharedData setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int getMax() {
        return max;
    }

    public SharedData setMax(int max) {
        this.max = max;
        return this;
    }

    public synchronized boolean checkAvaiable(){
        return num < 10;
    }
}
