package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine1 f = new FireEngine1();

        if(f instanceof FireEngine1) {
            System.out.println("hello");
        }

        if(f instanceof Car1) {
            System.out.println("hello");
        }

        if(f instanceof Object) {
            System.out.println("hello");
        }

        System.out.println(f.getClass().getName());

    }
}

class Car1 {};
class FireEngine1 extends Car1 {};