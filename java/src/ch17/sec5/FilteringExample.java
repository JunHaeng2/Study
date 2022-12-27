package ch17.sec5;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("a"))
                .forEach(System.out::println);

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("a"))
                .forEach(System.out::println);
    }
}
