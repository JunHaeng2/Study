package ch16.sec4;

import static java.lang.Double.sum;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y) -> {
            return x + y;
        });

        person.action((x, y) -> (x + y));
        person.action((x, y) -> sum(x, y));
    }
}
