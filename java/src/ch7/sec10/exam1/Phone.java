package ch7.sec10.exam1;

public class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원을 킵니다.");
    }

    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
