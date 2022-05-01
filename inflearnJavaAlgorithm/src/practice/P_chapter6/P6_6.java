package practice.P_chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P6_6 {

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) arr1[i] = arr[i];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] != arr[i]) ans.add(i + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
