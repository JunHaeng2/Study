package ch7;

class Parent {
    int x = 10;
}

class Childe extends Parent {
    int x = 20;
    void method() {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Childe c = new Childe();
        c.method();
    }
}
