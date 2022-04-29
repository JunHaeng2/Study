package practice.P_chapter2;

import java.util.Scanner;

public class P2_10 {

    public static int solution(int n, int[][] arr) {
        int ans = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1 ; j++) {
                if (arr[i][j] > arr[i - 1][j - 1]
                && arr[i][j] > arr[i - 1][j + 1]
                && arr[i][j] > arr[i + 1][j - 1]
                && arr[i][j] > arr[i + 1][j + 1]) {
                    ans += 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
