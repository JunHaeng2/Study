package practice.P_chapter2;

import java.util.Scanner;

public class P2_2 {

    public static int solution(int n, int[] arr) {
        int cnt = 1;
        int maxTall = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxTall) {
                cnt += 1;
                maxTall = arr[i];
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
