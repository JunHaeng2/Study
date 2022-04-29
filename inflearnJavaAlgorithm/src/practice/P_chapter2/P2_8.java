package practice.P_chapter2;

import java.util.Scanner;

public class P2_8 {

    public static String solution(int n, int[] arr) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt += 1;
                }
            }

            answer += String.valueOf(cnt) + " ";
        }

        return answer;
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
