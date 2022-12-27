package ch15.sec5.exam3;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("gfdf", 30));
        treeSet.add(new Person("fdff", 21));


    }
}
