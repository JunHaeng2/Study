package ch16.sec1.exam1;

public class LambdaExample {
    public static void main(String[] args) {
        action((x, y) -> {
            int result = x + y;
            System.out.println(result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println(result);
        });
    }

    private static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
