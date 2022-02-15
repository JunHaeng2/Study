import kr.tpc.MemberVO;

public class TPC18 {
    public static void main(String[] args) {
        
        MemberVO m = new MemberVO("홍길동", 40, "010-4444-4444", "서울");
        // setter method 필요없음. 생성자에서 바로 초기화를 시켜주었기에

        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();

        m1.setName("안녕");
        m1.setAddr("광주");
        m1.setAge(20);
        m1.setTel("010-1111-1111");

        System.out.printf("%s %d %s %s", m1.getName(), m1.getAge()
        , m.getAddr(), m.getTel());

        // 자동으로 toString이 출력된다.
        System.out.println(m1);
    }
}
