/*
object class : 다형성 인수, 다형성 배열


*/
import kr.tpc.*;

public class TPC34 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        display(a);
        display(b);

    }

    // 이렇게 다운캐스팅해서 사용
    private static void display(Object o) {
        if(o instanceof A) {
            ((A)o).go();
        } else {
            ((B)o).go();
        }
    }
}
