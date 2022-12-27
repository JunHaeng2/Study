package ch15.sec5;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for (Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        NavigableSet<Integer> d = scores.descendingSet();
        for (Integer s : d) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

    }
}
