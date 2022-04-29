package practice.P_chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2_9_1 {

    public static int solution(int n, int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int answer = 0;
            for (int j = 0; j < n; j++) {
                answer += arr[i][j];
            }
            ans.add(answer);
        }

        for (int i = 0; i < n; i++) {
            int answer = 0;
            for (int j = 0; j < n; j++) {
                answer += arr[j][i];
            }
            ans.add(answer);
        }

        int tmp1 = 0;
        for (int i = 0; i < n; i++) {
            tmp1 += arr[i][i];
        }
        ans.add(tmp1);

        int tmp2 = 0;
        for (int i = 0; i < n; i++) {
            tmp2 += arr[i][n - 1 - i];
        }
        ans.add(tmp2);

        return Collections.max(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
