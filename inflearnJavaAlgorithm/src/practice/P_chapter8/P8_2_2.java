package practice.P_chapter8;

import java.util.Scanner;

public class P8_2_2 {
    static int answer = Integer.MIN_VALUE, c, n;

    public static void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1,sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
