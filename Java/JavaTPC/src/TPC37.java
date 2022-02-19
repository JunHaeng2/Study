/*
패키지
-> 기능이 비슷한 클래스끼리 그룹으로 묶어놓은 단위를 패키지라고 한다.
-> package 외부에서 접근하는것을 막을 때 사용함 / 이런목적으로는 크게 사용안됨

클래스의 이름은 2가지이다.
기본이롬 : Myclass
패키지를 포함한 이름(class full name) kr.tpc.Myclass

패키지 내부의 클래스는 기본적으로 default 접근권한을 갖는다.
package 내부에 있는 클래스에게는 public
package 외부에 있는 클래스에게는 private

일반적으로는 외부에서 사용하게 만드는형태가 기본적이기에 public으로 많이쓰임

*/
import kr.inflearn.*;

public class TPC37 {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.sum(1, 100));
    }
}
