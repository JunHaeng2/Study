package ch8.sec9;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceC impl = new InterfaceImpl();
        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.method();
        ic.methodA();
        ic.methodB();
    }
}
