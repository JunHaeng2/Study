package practice.P_chapter6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P6_7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            else
                return Integer.compare(o1[0], o2[0]);
        });

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][0] + " ");
            System.out.print(arr[i][1]);

            if (!(i == n - 1)) {
                System.out.println();
            }
        }
    }
}
