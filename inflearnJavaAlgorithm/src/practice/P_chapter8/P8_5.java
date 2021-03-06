package practice.P_chapter8;

import java.util.Scanner;

public class P8_5 {
    static int n, m, answer = Integer.MIN_VALUE;
    public static void DFS(int L, int sum, int[] arr) {
        if (sum > m) return;
        if (sum==m) {
            answer = Math.min(answer, L);
        }
        else {
            for (int i=0; i<n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
