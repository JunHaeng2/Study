package ch9;

public class CardToString2 {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println(c.toString());
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + " ,number + " + number;
    }
}
