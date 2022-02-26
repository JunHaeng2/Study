package ch6;

class Car {
    String color;
    String gearType;
    int door;

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

}


public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("blue", "gear", 10);
        System.out.println(c.color + c.gearType + c.door);
    }
}
