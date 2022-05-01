package practice.P_chapter6;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_4 {

    public static ArrayList<Integer> solution(int s, int n, int[] arr) {
        ArrayList<Integer> cache= new ArrayList<>();

//        for (int i = 0; i < arr.length; i++) {
//            if (cache.contains(arr[i]) {
//                for (int j = )
//            }
//        }

        return cache;
    }

    public static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

    }
}
