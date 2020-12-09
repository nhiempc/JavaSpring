package Lession1.Activity16;

public class SharedData {
    int num;
    int numMax;
    int quantity;
    int max = 0;
    int index = 1 ; //Thread 1, Thread 2, Thread 3

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

    public int getIndex() {
        return index;
    }

    public SharedData setIndex(int index) {
        this.index = index;
        return this;
    }
}
