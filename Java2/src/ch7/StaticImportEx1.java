package ch7;

// static을 붙여두면은 앞에다 Math.할필요가 없음..!
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
    }
}
