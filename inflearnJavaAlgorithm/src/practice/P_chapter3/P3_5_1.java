package practice.P_chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class P3_5_1 {

    public static int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        int len = n / 2 + 2;

        int[] arr = new int[len];
        for (int i = 1; i < len; i++) {
            arr[i] = i;
        }

        for (int rt = 0; rt < len; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum > n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        System.out.println(solution(n));
    }
}

