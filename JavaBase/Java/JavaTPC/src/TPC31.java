import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

/*
인터페이스(규약)와 JDBC의 관계
-> 인터페이스 단독으로는 활용 불가, 자식클래스가 필요함
-> 자식클래스가 부모클래스의 추상메서드들을 재정의하기 때문에

JDBC programming 

자바 개발자 -> 인터페이스 -> DB벤더 공급자들이 만들어준 클래스를 동일한
이름으로서 사용할수 있음/ 메소드의 내용은 다르게 사용하면서
하위 클래스의 구현 내용은 알 필요 없이 동일한 메서드 이름 사용을 통한 .. !

*/
import kr.tpc.*;

public class TPC31 {
    public static void main(String[] args) {
        // Oracle, MySQL -> Driver class
        
        // Driver class를 다운로드 받아서, Java에서 제공해주는 인터페이스를
        // 통해 접속하여 사용하는것, Driver class가 어떤식으로 동작하는지
        // 에 대해 구체적으로 알필요없이 동일한 메소드명으로 사용할수있다는게 장점임.
        DBconnect conn1 = new JavaOracle();
        conn1.getConnection("url", "bit", "12345");

        DBconnect conn2 = new JavaMySQL();
        conn2.getConnection("url", "bit", "12345");
    }    
}
