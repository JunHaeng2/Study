package ch17.sec1.exam1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
