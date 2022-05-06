package level1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
    public int[] solution(int a, int b) {
        int[] answer = {};
        int min = (a < b) ? a : b;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        answer = new int[2];
        answer[0] = gcd;
        answer[1] = a * b / gcd;

        return answer;
    }

    public static void main(String[] args) {
        최대공약수와최소공배수 s = new 최대공약수와최소공배수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(s.solution(n, m));
    }
}
