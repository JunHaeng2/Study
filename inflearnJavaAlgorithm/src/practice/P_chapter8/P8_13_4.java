package practice.P_chapter8;

//DFS로 풀어보자

import java.util.Scanner;

public class P8_13_4 {
    static int answer = 0, n;
    // 각각 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void DFS(int x, int y, int[][] board) {
        for (int k = 0; k < 8; k++) {
            int nx = dx[k] + x;
            int ny = dy[k] + y;

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public static void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        solution(arr);
        System.out.println(answer);
    }

}
