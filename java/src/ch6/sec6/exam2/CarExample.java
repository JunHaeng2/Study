package ch6.sec6.exam2;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color);
        System.out.println(myCar.speed);

        myCar.speed = 60;
        System.out.println(myCar.speed);
    }
}
