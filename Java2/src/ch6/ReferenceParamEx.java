package ch6;

class Data {
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        ReferenceParamEx.change(d);
        System.out.println("After");
        System.out.println("main() : x = " + d.x);

    }

    // 이런식으로 참조형으로 객체를 설계하면, 그 자체를 가르키는것이기 때문에 원본의 변화를 가져올수 있음.
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
