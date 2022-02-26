package ch7;

class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        NUMBER = num;
        KIND = kind;
    }

    // 기본적으로 c를 sout하게 되면 toString으로 나오게 된다.
    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);

        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
