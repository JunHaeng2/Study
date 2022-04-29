package practice.P_chapter3;

import java.util.Scanner;

public class P3_3 {

    public static Integer solution(int n, int k, int[] arr) {

        // 시간초과..
        int cost = 0;
        int answer = 0;

        for (int i = 0; i < n - k; i++) {
            for (int j = i; j < i + k; j++) {
                cost += arr[j];
            }
            if (cost > answer) answer = cost;
            cost = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
