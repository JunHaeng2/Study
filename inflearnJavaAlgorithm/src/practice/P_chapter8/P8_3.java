package practice.P_chapter8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P8_3 {
    static int n, m;
    static int answer;

    public static void DFS(int level, int answer, int[][] arr) {
        if (answer > m) return;
        else if (level == n) {
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i][0];
            }
        }
        else {
            DFS(level + 1, answer + arr[level + 1][0], arr);
            DFS(level + 1, answer, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[1]));
        DFS(0, 0,arr);
        System.out.println(answer);
    }
}
