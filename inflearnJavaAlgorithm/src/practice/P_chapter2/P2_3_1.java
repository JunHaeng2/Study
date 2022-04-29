package practice.P_chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_3_1 {

    public static ArrayList<String> solution(int n, int[] arr1, int[] arr2) {

        ArrayList<String> arr = new ArrayList<>();

        // 꼭 이런 비교로 하려하지말고, 생각을 해보는게 좋을듯..?

        for (int i = 0; i < n; i++) {
            if (arr1[i] == 1) {
                if (arr2[i] == 1) {
                    arr.add("D");
                } else if (arr2[i] == 2) {
                    arr.add("B");
                } else {
                    arr.add("A");
                }
            } else if(arr1[i] == 2) {
                if (arr2[i] == 1) {
                    arr.add("A");
                } else if (arr2[i] == 2) {
                    arr.add("D");
                } else {
                    arr.add("B");
                }
            } else {
                if (arr2[i] == 1) {
                    arr.add("B");
                } else if (arr2[i] == 2) {
                    arr.add("A");
                } else {
                    arr.add("D");
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (String s : solution(n, arr1, arr2)) {
            System.out.println(s);
        }
    }
}
