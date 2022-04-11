package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car ca = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        // ca = ca.water();

        fe2 = (FireEngine)ca;

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("운전");
    }

    void stop() {
        System.out.println("정지");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
