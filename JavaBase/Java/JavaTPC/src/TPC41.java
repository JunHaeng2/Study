import java.util.ArrayList;
import kr.inflearn.ObjectArray;

/*
Object가 나오면 결국 다형성을 보장한다는 소리임.

*/
import kr.tpc.*;

public class TPC41 {
    public static void main(String[] args) {
        ObjectArray a = new ObjectArray(5);

        ArrayList arr = new ArrayList(5); // Object[], 배열의 길이에 제약이 없다.

        a.add(new A());
        a.add(new B());
        a.add(new A());
        a.add(new B());
        a.add(new A());

        for(int i = 0; i < a.size(); i++) {
            Object o = a.get(i);
            if(o instanceof A) {
                ((A)o).go();
            } else if (o instanceof B) {
                ((B)o).go();
            }
        }
    }
}
