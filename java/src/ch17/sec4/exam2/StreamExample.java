package ch17.sec4.exam2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"g", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.println(item));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.println(item));
        System.out.println();
    }
}
