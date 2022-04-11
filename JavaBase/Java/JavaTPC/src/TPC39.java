/*
String 클래스
문자열 -> String 자바에서는 문자열은 객체로 취급됨
객체로 취급된다는 소리는 새로운 Type으로 만들어 주어야 한다는 말 임 ! 
기본적으로 제공되는 String 클래스를 통해서 

1. 자바에서 문자열은 쌍따옴표 " " 로 감싸면 된다.
2. 자바에서 문자열을 저장하는 기본 자료형(Data Type)은 없다.
3. 문자열은 여러가지 조작을 할 수 있기 때문에 별도의 클래스 자료형을 만들어 두었다.
4. 그래서 자바에서 문자열은 객체로 취급된다! 

Heap Area -> 객체가 생성되는 메모리 영역
Literal Pool -> 문자열 상수(객체)가 생성되는 메모리 영역, 재활용가능

*/

public class TPC39 {
    public static void main(String[] args) {
        // 이 경우에는 아무리 같은 단어라 할지라도 객체로 생성되기에
        // Heap Area에서 다른 객체의 주소를 가르키고 있는 형태이다
        String str1 = new String("APPLE");

        // 이런식으로 문자열을 상수로 생성하면 서로 같은 번지를 가르키고 있음
        // 이렇게 만들면 Heap Area에 생성되는게 아니라(객체로 생성되는게 아니라)
        // Literal Pool에 생성이 된다. 재활용되기 때문에 같은 주소를 가르킴
        String str2 = "APPLE";
        String str3 = "APPLE"; 

        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());        
    }
}
