/*
object class
-> 자바에서의 최상위 클래스, 최초의 부모
-> 모든 클래스의 root 클래스

toString (객체를 String으로 만들어주는 메서드)
--> object클래스에 포함되어 있음

클래스를 설계할때 기본적으로 생략된 코드
1. import java.lang.*;
2. extends Object
3. public A() {
    super();
}

*/
import kr.poly.*;

public class TPC33 {
    public static void main(String[] args) {
        
        A a = new A();
        a.display();

        System.out.println(a);
        
        Object o = new A();

        ((A)o).display();
        System.err.println(o);
    }
}
