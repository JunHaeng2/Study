package ch6.sec7.exam2;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("박자바",
                "010-3432432");

        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println(k1.nation);
    }
}
