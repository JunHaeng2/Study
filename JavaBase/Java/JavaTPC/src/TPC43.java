/*
Wrapper 클래스
-> 기본자료형을 객체자료형으로 사용할수 있도록 만들어놓은 자료형

int Integer
float Float
char Character
boolean Boolean

-> Object 타입과 연동해서 사용하기 위해서
기본 자료형을 Objet 배열에 저장할 경우에는
객체형 자료형으로 변동되어서 저장되는거임
obj[0] = new integer(1); 

*/


public class TPC43 {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1; // Boxing, 자바가 컴파일시 자동적으로 Integer로 바꿔줌
        // Integer b = new Integer(1);
        
        System.out.println(b.intValue());
        System.out.println(b.toString());

        Object[] obj = new Object[3];
        obj[0] = new Integer(1);
        obj[1] = new Integer(2);
        obj[2] = new Integer(3);

        System.out.println(obj[0].toString());
        System.out.println(obj[1].toString());
        System.out.println(obj[2].toString());

        String x = "100";
        String y = "100";

        int v1 = Integer.parseInt(x);
        int v2 = Integer.parseInt(y);

        System.out.println(v1 + v2);

        String v3 = String.valueOf(v1);
        String v4 = String.valueOf(v2);

        System.out.println(v3 + v4);
        
    }
}
