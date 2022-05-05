package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node3 {
    public int x, y;
    Node3 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 아이디어는 맞는데, 왜 if문에서 답을 들어가지 못하는지가 이해가 안감
public class P8_12 {
    static int[][] visited, board;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Node3> q = new LinkedList<>();

    public static void bfs() {

        while (!q.isEmpty()) {
            Node3 node = q.poll();

            for (int j = 0; j < 4; j++) {
                int nx = node.x + dx[j];
                int ny = node.y + dy[j];

                if (nx < n && nx >= 0 && ny < m && ny >= 0 && board[nx][ny] == 0) {
                    visited[nx][ny] = 1;
                    q.offer(new Node3(nx, ny));
                    board[nx][ny] = board[node.x][node.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        visited = new int[n][m];
        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    q.offer(new Node3(i, j));
                    visited[i][j] = 1;
                }
            }
        }

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
