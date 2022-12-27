package ch15.sec3.exam1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("jdbc");
        set.add("java");

        int size = set.size();
        System.out.println(size);
    }
}
