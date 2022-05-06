package level1;

import java.util.Scanner;

public class 정수제곱근판별 {

    static class Solution {
        public double solution(long n) {
            Double sqrt = Math.sqrt(n);

            if(sqrt == sqrt.intValue()) {
                return (long) Math.pow(sqrt + 1, 2);
            } else return -1;
        }
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(t.solution(n));
    }
}
