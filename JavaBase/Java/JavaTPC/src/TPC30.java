/*
추상클래스, 인터페이스 -> 다형성을 보장하기 위해서
인터페이스는 다중 상속을 지원한다 ! 중요

*/
import kr.poly.*;

public class TPC30 {
    public static void main(String[] args) {
        // Remocon으로 TV 클래스를 구동하시오.
        
        Remocon r = new TV();
        
        for(int i = 0; i < 40; i++) {
            r.chUp();
        }

        for(int i = 0; i < 40; i++) {
            r.chDown();
        }

    }
}
