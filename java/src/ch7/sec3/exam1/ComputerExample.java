package ch7.sec3.exam1;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calcuator calcuator = new Calcuator();
        Computer computer = new Computer();
        System.out.println(calcuator.areaCircle(r));
        System.out.println(computer.areaCircle(r));
    }
}
