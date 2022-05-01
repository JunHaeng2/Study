package practice.P_chapter6;

import java.util.Scanner;

public class P6_3 {

    public static int[] solution(int size, int[] a) {

        for (int i = 1; i < size; i++) {
            int target = a[i];

            int j = i - 1;
            while(j >= 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = target;
        }


//        int target = 1;
//        while (true) {
//            if (target == size) break;
//
//            for (int i = target - 1; i < 0; i--) {
//                if (a[target] < a[i]) {
//                    int tmp = a[target];
//                    a[target] = a[i];
//                    a[i] = tmp;
//                }
//            }
//            target++;
//        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
