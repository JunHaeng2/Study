package ch17.sec6.exam1;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("a", 10));
        studentList.add(new Student("b", 20));
        studentList.add(new Student("c", 30));

        studentList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(System.out::println);
    }
}
