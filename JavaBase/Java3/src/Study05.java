import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Study05 {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        UnaryOperator<String> hi = Greeting::hi;
        UnaryOperator<String> hello = greeting::hello;

        Function<String, Greeting> keesunGreeting
                = Greeting::new;

        Greeting keesun = keesunGreeting.apply("keesun");
        System.out.println(keesun.getName());

        Supplier<Greeting> newGreeting = Greeting::new;

        String[] names = {"keesun", "whiteship", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
