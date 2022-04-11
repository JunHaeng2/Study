/*
객체 생성 과정
객체 -> 상태정보/행위정보
BookVO b = new BookVO();

. => 접근, 참조 연산자 

*/
import kr.tpc.BookVO;

public class TPC13 {
    public static void main(String[] args) {
        // 책 1권을 저장하기 위해 객체를 생성하시오
        
        BookVO b1 = new BookVO();
        b1.title = "파이썬";
        b1.price = 16000;
        b1.company = "dkfdf";
        b1.page = 700;

        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.company);
        System.out.println(b1.page);

    }
}
