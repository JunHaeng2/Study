package practice.P_chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class P8_2_1 {
    static int c, n;
    static int answer;
    static int max = Integer.MIN_VALUE;

    public static void DFS(int level, int answer, int[] arr) {
        if (answer > c) return;
        else if (level == n) {
            max = Math.max(max, answer);
        }
        else {
            DFS(level+1, answer + arr[level], arr);
            DFS(level+1, answer, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        DFS(0, 0, arr);
        System.out.println(max);
    }
}
