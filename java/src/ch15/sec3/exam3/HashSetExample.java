package ch15.sec3.exam3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("jdbc");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("java")) {iterator.remove();}
        }
        System.out.println();

        for (String e : set) {
            System.out.println(e);
        }
    }
}
