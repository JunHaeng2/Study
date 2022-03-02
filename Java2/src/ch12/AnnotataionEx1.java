package ch12;

abstract class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    void parentMethod() {}
}
