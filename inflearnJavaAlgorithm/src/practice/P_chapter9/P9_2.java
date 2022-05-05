package practice.P_chapter9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P9_2 {

    public static int solution(int[][] arr) {
        int endTime = arr[0][1];
        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >= endTime) {
                cnt++;
                endTime = arr[i][1];
            }
        }
        return cnt;
    }

    // 2 3 1
    // 1 4
    // 3 5 1
    // 4 6
    // 5 7 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[1]));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][1]);
//        }

        System.out.println(solution(arr));
    }
}
