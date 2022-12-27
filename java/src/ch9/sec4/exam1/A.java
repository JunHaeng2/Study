package ch9.sec4.exam1;

public class A {
    A() {
        class B {}
        B b = new B();
    }

    void method() {
        class B {}

        B b = new B();
    }
}
