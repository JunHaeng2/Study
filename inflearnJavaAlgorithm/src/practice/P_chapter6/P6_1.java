package practice.P_chapter6;

import java.util.Scanner;

public class P6_1 {

    public static int[] solution(int n, int[] arr) {

        // 첫번째 숫자를 생각하지 않았음.. 첫번쨰
        // 숫자가 최솟값이라면 바꿀 필요가없는건데?

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
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
