package ch6.sec8.exam2;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result1 = myCom.sum(1, 2, 3);
        int result2 = myCom.sum(new int[]{1, 2, 3});
    }
}
