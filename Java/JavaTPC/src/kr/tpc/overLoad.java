package kr.tpc;

public class overLoad {
    // 동작으로만 이루어진 객체
    
    public void hap(int a, int b) {
        System.out.println(a + b);
    }

    public void hap(float a, int b) {
        System.out.println(a + b);
    }

    public void hap(int a, float b) {
        System.out.println(a + b);
    }

    public void hap(float a, float b) {
        System.out.println(a + b);
    }
}
