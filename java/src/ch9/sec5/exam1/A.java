package ch9.sec5.exam1;

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        void method() {
            field1 = 10;
            method1();
        }
    }

    static class C {
        void method() {
            field2 = 10;
            method2();
        }
    }
}
