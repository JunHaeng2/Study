package practice.P_chapter8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P8_2 {
    static int c, n;
    static int answer;
    static int ch[], arr[];

    public static void DFS(int c, int n) {
        if (answer > c) return;
        else {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        DFS(c, n);
        System.out.println(answer);
    }
}
