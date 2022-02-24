package ch6;

class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    long divide(long a, long b) {
        return a / b;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long result1 = mm.add(10l,20l);
        long result2 = mm.divide(10l, 20l);
        long result3 = mm.multiply(10l, 20l);
        long result4 = mm.subtract(20l, 10l);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
