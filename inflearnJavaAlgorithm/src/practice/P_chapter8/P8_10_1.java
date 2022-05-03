package practice.P_chapter8;

import java.util.Scanner;

public class P8_10_1 {
    static int[][] board, dis;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;

    public static void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && ny <= 7 && nx <= 7 && ny >= 1 && board[nx][ny] == 0) {
                    // 앞으로 갔다가 빽하는 이부분을 잘 알아야해.. !
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        DFS(1, 1);
        System.out.println(answer);
    }
}