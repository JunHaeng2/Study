package ch6;

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {

        // 이런식으로 클래스 변수같은 경우에는 객체를 생성하지 않고도 사용 가능하다
        // 물론 객체변수로도 사용할수 있지만, 객체변수인지 클래스변수인지 헷갈릴수있기 때문에 이런식으로 사용하자.
        // Card.width, Card.height
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 멤버변수 중에서 인스턴스 변수는 객체를 선언하지 않고는 사용할수 없다.
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 10;
        System.out.println(c1.kind + c1.number);

    }
}
