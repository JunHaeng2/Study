/*
class, object, instance 상호관계

class 객체를 설계하는 설계도 정도로 이해
object 클래스의 타입을 갖는 변수 -> 객체를 담는 변수 -> 객체! 
instance 객체가 가르키는 구체적인 대상물을 갖는 변수-> 인스턴스 변수 -> 인스턴스 ! 

객체생성과정 -> 인스턴스를 만드는 과정(구체적인 대상물을 만드는 과정)

*/

import kr.tpc.BookDTO;

public class TPC16 {
    public static void main(String[] args) {
        // 책 -> class(BookDTO) -> 객체 -> 인스턴스
        String title = "스프링";
        int price = 25000;
        String company = "제이펍";
        int page = 890;

        BookDTO dto; // dto(Object : 객체) 현재는 구체적인 데이터 x 
        dto = new BookDTO(title, price, company, page); // 인스턴스 구체적인 데이터 o 
        
        bookPrint(dto);      
    }

    public static void bookPrint(BookDTO dto) {
        System.out.println(dto.title);
        System.out.println(dto.page);
        System.out.println(dto.price);
        System.out.println(dto.company);
    }
}
