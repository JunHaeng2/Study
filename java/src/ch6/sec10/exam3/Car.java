package ch6.sec10.exam3;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "달립니다.");
    }

    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
