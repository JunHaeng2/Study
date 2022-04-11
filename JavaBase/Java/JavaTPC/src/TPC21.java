import kr.tpc.MyUtil;

/*
class 
1. Datatype 측면 : 새로운 자료형을 만드는 도구 -> 모델링 도구
2. OOP 축면 : 객체의 상태정보와 행위정보를 추출하여 캡슐화하는 도구
3. 바구니의 경우 : 데이터의 이동을 위한 도구

class model의 종류
1. DTO(data tranfer object) : 데이터의 이동/저장을 위해 담는 역할
2. DAO(data access object) : 데이터를 처리하는 역할(비지니스의 역할)
 - 데이터를 처리해주고 가공해주는 역할을 한다고 생각하면됨
3. utility : 도움을 주는 기능의 역할(날짜, 시간, 통화, 인코딩 등)
 
*/
import kr.tpc.MyUtil;

public class TPC21 {
    public static void main(String[] args) {
        // 1. Java에서 제공해주는 클래스들... API    
        // 문자열(String)

        String str = new String("APPLE");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // 2. 직접 만들어서 사용하는 class들... 
        // DTO/VO, DAO, Utility ... API
        MyUtil my = new MyUtil();

        System.out.println(my.hap());

        // 3. 다른 회사에서 만들어 놓은 class들..
        // API
        // Gson -> json 데이터 포맷 만드는 API
        

    }
}
