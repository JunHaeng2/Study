/*
Java API 접근하기
API -> 여러개의 클래스를 하나로 묶어놓은 형태라고 생각하면됨
jar -> 클래스를 묶었다. 압축파일 

*/

public class TPC38 {
    public static void main(String[] args) {
        // String -> java.lang.String

        // String이라는 객체에 APPLE이 올라가 있고, str이 이를 가르키는것
        String str = new String("APPLE");
        
        System.out.println(str.hashCode());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('P'));
        System.out.println(str.indexOf('X'));
    }
}
