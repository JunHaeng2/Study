package practice.P_chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_2 {

    public static int[] solution(int n, int[] arr) {

        int size = arr.length - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
