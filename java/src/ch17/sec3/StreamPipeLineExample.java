package ch17.sec3;

import ch15.sec2.exam1.ArrayListExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("1", 10),
                new Student("2", 20),
                new Student("3", 30)
        );

        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student
        -> student.getScore());

        double avg = scoreStream.average().getAsDouble();

        double avg1 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println(avg1);
    }

}
