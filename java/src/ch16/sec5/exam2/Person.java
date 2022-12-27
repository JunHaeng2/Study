package ch16.sec5.exam2;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "a";
        String b = "b";

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(1);
        } else if (result == 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
