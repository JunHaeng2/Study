package practice.P_chapter8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P8_3_1 {
    static int n, m;
    static int sumTime;
    static int answer = 0;

    public static void DFS(int level, int sumTime, int time, int[][] arr) {
        if (time > m) return;
        if (level == n) {
            answer = Math.max(answer, sumTime);
        }
        else {
            DFS(level+1, sumTime + arr[level][0], time +arr[level][1], arr);
            DFS(level+1, sumTime, time, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[1]));
        DFS(0, 0, 0, arr);

        System.out.println(answer);
    }
}
