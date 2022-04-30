package practice.P_chapter6;

import java.util.Scanner;

public class P6_1 {

    public static int[] solution(int n, int[] arr) {

        int minValue = 100;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
