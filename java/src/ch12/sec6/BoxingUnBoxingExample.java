package ch12.sec6;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value " + obj.intValue());

        int value = obj;

        int result = obj + 100;
    }
}
