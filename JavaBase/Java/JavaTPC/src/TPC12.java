/*
기본자료형(PDT) vs 사용자정의자료형(UDDT)
컴파일러에서 기본적으로 제공해주는 자료형
사용자가 직접 만들어서 사용하는 자료형 
neww => 객체를 생성하라는 명령어
this : 자기 자신을 가르키는

*/

import kr.tpc.BookDTO;

public class TPC12 {
    public static void main(String[] args) {
        // int, float, char, boolean -> PDT
        int a = 10;

        //책(BookDTO) 이라는 자료형을 만들자 -> class
        // BookDTO b = new BookDTO();

        // b.company = "abcd";
        // b.page = 10;
        // b.price = 2000;
        // b.title = "hello";

        // System.out.println(b.company);
        // System.out.println(b.page);
        // System.out.println(b.price);
        // System.out.println(b.title);
        
    }
}

