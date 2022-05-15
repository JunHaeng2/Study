package BJ;

import java.util.Scanner;

public class P1260 {
    static boolean[] visited;
    static int[][] arr;
    static int n, m, v;

    private static void dfs(int i) {
        visited[i] = true;
        System.out.print(i + " ");
        for (int j = 1; j < n+1; j++) {
            if (arr[i][j] == 1 && visited[i] == false) {
                dfs(j);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }

        visited = new boolean[n+1];
        dfs(v);
    }
}
