package ch6;

class Car1 {
    String color;
    String gearType;
    int door;

    Car1(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car1() {

    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        System.out.println();
    }
}
