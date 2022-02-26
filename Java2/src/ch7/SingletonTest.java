package ch7;


// 싱글톤 패턴, 객체의 생성의 개수를 제한하고자 할때 사용하는거.. !
final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        // ....
    }

    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }

        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

    }
}
