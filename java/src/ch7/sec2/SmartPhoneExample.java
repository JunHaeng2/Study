package ch7.sec2;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        myPhone.wifi = true;
        myPhone.bell();
    }
}
