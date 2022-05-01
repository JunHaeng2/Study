package practice.P_chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class P6_7 {

    public static int[][] solution(int n, int[][] arr) {

//        Arrays.sort(arr, ((o1, o2) -> {
//            if(o1[0] == o2[0]) {
//                return Integer.compare(o1[1], o2[0]);
//            } else {
//                return Integer.compare(o1[1], o2[1]);
//            }
//        }));

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        solution(n, arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            if (i != n -1) {
                System.out.println();
            }
        }
    }
}
