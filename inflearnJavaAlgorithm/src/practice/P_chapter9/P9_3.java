package practice.P_chapter9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P9_3 {

    public static int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            int st = arr[i][0];
            int et = arr[i][1];

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j][0] >= st && arr[j][0] < et) cnt++;
            }

            answer = Math.max(cnt, answer);
        }

        return answer;
    }

    // 5 14
    // 12 15
    // 14 18
    // 15 20
    // 20 30

    // 5 14  1
    // 12 15 1
    // 14 18 0
    // 15 20 0
    // 20 30 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

        System.out.println(solution(arr));
    }
}
