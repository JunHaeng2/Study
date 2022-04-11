import kr.poly.Radio;
import kr.poly.Remocon;
import kr.poly.TV;

/*
인터페이스(interface) : 100% 다형성을 보장한다.
1. 100% 추상메서드만 가능
2. 구현된 메서드를 가질수 없다. 

서로 비슷한 기능을 갖고있는 경우는 추상클래스 활용
다른 기능을 포함하고있는건 인터페이스 활용

interface -> implements

하위클래스의 동작방식을 몰라도 인터페이스로 100% 동작시킬수 있음

*/

public class TPC29 {
    public static void main(String[] args) {
        Remocon r1 = new TV();
        r1.chDown();
        r1.chUp();
        r1.internet();

        Remocon r2 = new Radio();
        r2.chDown();
        r2.chUp();
        r2.internet();
    }
}
