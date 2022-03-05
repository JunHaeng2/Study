import java.util.function.*;

public class Foo4 {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        BinaryOperator<Integer> get11 = (a, b) -> a + b;

        Foo4 foo = new Foo4();
        foo.run();

    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}
