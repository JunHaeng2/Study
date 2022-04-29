package practice.P_chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class P3_1 {

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int numArr1 = 0;
        int numArr2 = 0;

        while (true) {
            if (n == numArr1) {
                for (int i = numArr2; i < m; i++) {
                    answer.add(arr2[i]);
                }
                break;
            }

            if (m == numArr2) {
                for (int i = numArr1; i < n; i++) {
                    answer.add(arr1[i]);
                }
                break;
            }

            if (arr1[numArr1] > arr2[numArr2]) {
                answer.add(arr2[numArr2]);
                numArr2++;
            } else if (arr1[numArr1] < arr2[numArr2]) {
                answer.add(arr1[numArr1]);
                numArr1++;
            } else {
                answer.add(arr1[numArr1]);
                answer.add(arr2[numArr2]);
                numArr1++;
                numArr2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (Integer integer : solution(n, m, arr1, arr2)) {
            System.out.print(integer + " ");
        }
    }
}
