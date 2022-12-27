package ch14.sec7.exam3;

import ch14.sec7.exam2.PrintThread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {};

        thread.interrupt();
    }
}
