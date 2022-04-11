/*
프로그래밍의 3대요소 : 변수, 자료형(DataType), 할당(=)

1. 변수 : 기억공간을 대표하는 이름(Variable)
   크기, 어떤 종류의 데이터를 저장할건가
2. 자료형 : DataType , 어떤 종류의 데이터인지
3. 변수 선언 -> 자료형 변수; ex) int a;  
4. 할당 : 변수에 데이터를 집어 넣는것

*/

public class TPC03 {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 1;
        c = a + b; // 2
        System.out.println(c);    
        
        float f; // float, double
        f = 34.5f;

        char d;
        d = 'A';
        System.out.println(d);

        boolean g;
        g = true;

        System.out.println(g);

    }    
}

