package ch8.sec8;

public class MultiInterfaceImpleExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("djfdsf");
    }
}
