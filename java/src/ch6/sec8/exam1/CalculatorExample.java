package ch6.sec8.exam1;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();
        int result1 = myCalc.plus(1, 2);
        System.out.println(result1);

    }
}
