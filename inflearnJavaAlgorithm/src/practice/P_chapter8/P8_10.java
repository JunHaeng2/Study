package practice.P_chapter8;

import java.util.Scanner;

public class P8_10 {
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

//    public static void DFS() {
//
//        for (int i = 0; i < 4; i++) {
//            int nx = arr[] + dx[i];
//            int ny = arr[]
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


    }
}
