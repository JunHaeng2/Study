/*
생성자 메서드(Constructor)
1. 객체를 생성할 때 사용되는 메서드
2. 객체 생성 후 객체의 초기화를 하는 역할을 수행
3. 클래스 이름과 동일한 메서드
4. 메스드의 return type이 없음(void는 아님)
5. public 접근 권한을 갖음(private 생성자인 경우도 있음)
6. 생성자가 없을 때에는 디폴트 값으로 생성자가 만들어 진다. 

*/
import kr.tpc.BookVO2;

public class TPC14 {
    // 생성자 -> 생성 + 초기화, 중복정의 가능함
    
    BookVO2 b = new BookVO2("hi", 100, "dfdf", 20000);
}
 