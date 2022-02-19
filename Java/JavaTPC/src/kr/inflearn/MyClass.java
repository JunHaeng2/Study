package kr.inflearn;

// default : 의미적으로 해석
// 패키지 안에서는 public, 밖에서는 private
public class MyClass {
    public int sum(int a, int b) {
        int hap = 0;
        for(int i = a; i <= b; i++) {
            hap += i;
        }

        return hap;
    }
}
