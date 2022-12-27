package ch17.sec7.exam1;

import ch16.sec5.exam2.Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("a", 10));
        studentList.add(new Student("b", 20));

        studentList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getScore()));

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));

    }
}
