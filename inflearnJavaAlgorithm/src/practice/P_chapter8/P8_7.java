package practice.P_chapter8;

import java.util.Scanner;

public class P8_7 {
    static int n, r;
    static int[][] arr;

//    public static int DFS(int a, int b) {
//        if (a == n && b == r) return arr[a][b];
//        else {
//            arr[a]
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        arr = new int[n][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;

    }
}

// 1
// 1 1
// 1 3 1
// 1 4 6 1
// 1 5 10 10 1
// 1 6 15 20 11 1