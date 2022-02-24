package ch6;

class Data1 {
    int x;
}

// 반환타입이 참조형이라는 소리는 메서드가 객체의 주소를 반환한다는걸 의미한다.
// 참조형은 그 원본의 주소값을 가지고 있다고 생각하면되는거임!!

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;

        Data1 d2 = Copy(d);

        System.out.println(d2.x);
        System.out.println(d.x);
    }

    static Data1 Copy(Data1 d) {
        Data1 tmp = new Data1(); // 새로운 객체 tmp를 생성한다.
        tmp.x = d.x; // d.x의 값을 tmp.x 값에 전달한다.

        return tmp; // return의 데이터가 Data1 인거임 !
    }
}
