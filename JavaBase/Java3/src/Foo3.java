import java.util.function.*;

public class Foo3 {
    public static void main(String[] args) {
        plus10 plus10 = new plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10.andThen(multiply2).apply(2));
        System.out.println(plus10.compose(multiply2).apply(2));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startsWithKeesun =
                (s) -> s.startsWith("keesun");
        Predicate<Integer> isEven = (i) -> i % 2 ==0;

        startsWithKeesun.negate();

        UnaryOperator<Integer> plus11 = (i) -> i + 10;

    }
}
