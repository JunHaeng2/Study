package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2 {
    public int x, y;
    Node2 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class P8_13 {
    static int[][] board, visited;
    static int n;
    static int answer = 0;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, - 1, 1, -1, 1};
    static Queue<Node2> Q = new LinkedList<>();

    public static void BFS() {

        while(!Q.isEmpty()) {
            Node2 tmp = Q.poll();
            visited[tmp.x][tmp.y] = 1;

            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= n || visited[nx][ny] == 1 || board[nx][ny] == 0) continue;

                visited[nx][ny] = 1;
                Q.offer(new Node2(nx, ny));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board = new int[n][n];
        visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1 && visited[i][j] == 0) {
                    Q.offer(new Node2(i, j));
                    BFS();
                    answer++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(answer);
     }
}
