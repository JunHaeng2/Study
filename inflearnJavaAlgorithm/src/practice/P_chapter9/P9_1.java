package practice.P_chapter9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P9_1 {
    static int answer = 0;

    public static void solution(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            int cnt = 0;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    cnt++;
                }
            }
            if (cnt > 0) continue;
            else answer++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[1]));
        solution(arr);

        System.out.println(answer);
    }
}
