package ch6;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // 생성자에 매개변수 전달이 필요함..
        // Data2 d2 = new Data2();
        Data2 d3 = new Data2(10);
    }
}
