package kr.poly;
import java.lang.Object;

public class A extends java.lang.Object{
    
    public A() {
        super();
    }

    public void display() {
        System.out.println("나는 A이다.");
    }

    // toString()

    @Override
    public String toString() {
        return "재정의 메소드 입니다.";
    }
}
