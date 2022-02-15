/*
private(정보은닉) : 다른 객체로부터 접근을 막는것
setter method -> 데이터를 넣어주는 메소드
getter method -> 데이터를 받아오는 메소드 
// 직접접근이 안될때 간접적으로 넣어주고 받아오는

*/
import kr.tpc.MemberVO;

public class TPC17 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();

        m.setName("홍길동");
        m.setAge(20);
        m.setTel("010-1111-1111");
        m.setAddr("서울");

        System.out.printf("%s %d %s %s", m.getName(), m.getAge(), m.getTel(), m.getAddr());

    }        
}
