package practice.P_chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P2_7 {

    // 못풀음

    public static int solution(int[] str) {

        int k = 0;

        int[] arr = new int[str.length];

        if (str[0] == 1) {
            arr[0] = 1;
        } else {
            arr[0] = 0;
        }

        for (int i = 1; i < str.length; i++) {
            if (str[i] == 0) {
                arr[i] = 0;
            } else {
                if (arr[i - 1] == 1) {
                    arr[i] = arr[i - 1] + 1;
                }
                arr[i] = 1;
            }
        }

        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }
}
